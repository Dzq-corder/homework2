<template>
  <el-row class="warp">
    <el-col :span="24" class="warp-breadcrum">
      <el-breadcrumb separator="/">
        <el-breadcrumb-item :to="{ path: '/' }"><b>首页</b></el-breadcrumb-item>
        <el-breadcrumb-item>降水观察数据</el-breadcrumb-item>
      </el-breadcrumb>
    </el-col>

    <el-col :span="24" class="warp-main" v-loading="loading" element-loading-text="拼命加载中">
      <!--工具条-->
      <el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
        <el-form role="form" :inline="true" size="small" id="projectForm" class="form-horizontal details">
          <el-row>
            <el-form-item label="测站名称:">
                <el-input size="mini" type="text" v-model="filters.hName" clearable>
                </el-input>
              </el-form-item>
              <el-form-item label="测站编码:">
                <el-input size="mini" type="text" v-model="filters.hCode" clearable>
                </el-input>
              </el-form-item>
              <el-form-item label="水系:">
                <el-input size="mini" type="text" v-model="filters.rSystem" clearable>
                </el-input>
              </el-form-item>
            <el-collapse-transition>
              <div v-show="showQueryCondition">
              </div>
            </el-collapse-transition>
              <el-form-item>
                <el-button :loading="loading" router-preventReClick size="mini" type="primary" plain icon="el-icon-search"
                           @click="handleSearch">查询
                </el-button>
                <!-- <ShowMore :clickCall="()=>this.showQueryCondition=!this.showQueryCondition"/> -->
                  <addForm size="mini" :call="search" icon="el-icon-plus" type="primary" title="新增" v-if="option('新增')"/>
              </el-form-item>
          </el-row>
        </el-form>
      </el-col>

      
      <!--列表-->
      <el-table :data="dataList" highlight-current-row @selection-change="selsChange" style="width: 100%;">
        <el-table-column type="index" width="60"></el-table-column>
        <el-table-column prop="hName" label="测站名称"></el-table-column>
        <el-table-column prop="hCode" label="测站编码"></el-table-column>
        <el-table-column prop="rSystem" label="水系"></el-table-column>
        <el-table-column prop="longitude" label="经度"></el-table-column>
        <el-table-column prop="latitude" label="纬度"></el-table-column>
        <el-table-column prop="avgFall" label="多年平均降雨量（mm）"></el-table-column>
        <el-table-column prop="maxFall" label="实测年最大降雨量（mm）"></el-table-column>
        <el-table-column label="操作" width="150">
          <template slot-scope="scope">
            <addForm :call="search" :data="scope.row" size="mini" title="编辑" v-if="option('编辑')"/>
            <el-button type="danger" @click="del(scope.$index,scope.row)" size="mini" v-if="option('删除')">删除</el-button>
          </template>
        </el-table-column>
      </el-table>

      <!--工具条-->
      <el-col size="mini" :span="24" class="toolbar">
        <el-pagination
          style="margin-top: 10px"
          background
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="page"
          :page-sizes="[10, 20, 50, 100]"
          :page-size="pageSize"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total">
        </el-pagination>
      </el-col>

    </el-col>
  </el-row>
</template>
<script>
  import addForm from './components/addForm';
  import api from '@/api/apiRainfallStation';
  import ShowMore from '@/components/ShowMore';

  export default {
    data() {
      return {
        colLayOut: {xs: 12,sm:12,md:6, lg: 6},
        formLabelWidth: "160px",
        filters: {
          id: ''
        },
        dataList: [],
        total: 0,
        page: 1,
        pageSize: 10,
        loading: false,
        showQueryCondition: false,
      }
    },
    //组件
    components: {
      addForm,ShowMore,
    },
    //方法
    methods: {
      option: function (s) {
        let menus = JSON.parse(window.localStorage.getItem("menus"));
        for (let i in menus) {
          let item = menus[i];
          if (item.name==='数据管理') {
            for (let j in item.children) {
              let ch = item.children[j];
              if (ch.name==='雨量站') {
                for (let k in ch.children) {
                  let as = ch.children[k];
                  if (s===as.name) {
                    return true;
                  }
                }
              }
            }
          }
        }
        return false;
      },
      handleSizeChange(val) {
        this.pageSize = val;
        this.search();
      },
      handleCurrentChange(val) {
        this.page = val;
        this.search();
      },
      handleSearch() {
        this.search();
      },
      search() {
        let that = this;
        let params = {
          pageNo: that.page,
          pageSize: that.pageSize,
          ...this.filters,
        };

        that.loading = true;
        api.listByPage(params, (result)=>{
          if (result.code == '0') {
            that.loading = false;
            if (result && result.page.list) {
              that.total = result.page.total;
              that.dataList = result.page.list;
            }
          } else {
            that.loading = false;
            that.$message. error({
              showClose: true,
              message: result.msg,
              duration: 2000
            });
          }
        });

      },
      selsChange(sels) {
        this.sels = sels;
      },
      //删除
      del(index, row) {
        let that = this;
        this.$confirm('确认删除该记录吗?', '提示', {type: 'warning'}).then(() => {
          that.loading = true;
          api.delete({id:row.id}, (result) => {
            that.loading = false;
            if (result && result.code == '0') {
              that.$message.success({showClose: true, message: '删除成功', duration: 1500});
              that.search();
            } else {
              that.$message. error({showClose: true, message: result.msg, duration: 2000});
            }
          });
        })
      },
    },
    mounted() {
      this.handleSearch()

    }
  }
</script>

