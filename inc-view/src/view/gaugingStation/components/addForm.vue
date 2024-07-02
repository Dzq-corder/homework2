<template>
  <span>
    <el-button :type="type" :size="size" :icon="icon" @click="showAddDialog">{{title}}</el-button>
    <el-col :span="24" class="warp-main" v-loading="loading" element-loading-text="拼命加载中">
      <!--新增界面-->
      <el-dialog :title="title" :visible.sync="addFormVisible" :close-on-click-modal="false">
        <el-form :model="data" label-width="80px" :rules="addFormRules" ref="addForm">
          <el-form-item label="测站名称" prop="hName">
            <el-input size="mini" v-model="data.hName" auto-complete="off"></el-input>
          </el-form-item>
          <el-form-item label="测站编码" prop="hCode">
            <el-input size="mini" v-model="data.hCode" auto-complete="off"></el-input>
          </el-form-item>
          <el-form-item label="水系" prop="rSystem">
            <el-input size="mini" v-model="data.rSystem" auto-complete="off"></el-input>
          </el-form-item>
          <el-form-item label="经度" prop="longitude">
            <el-input size="mini" v-model="data.longitude" auto-complete="off"></el-input>
          </el-form-item>
          <el-form-item label="纬度" prop="latitude">
            <el-input size="mini" v-model="data.latitude" auto-complete="off"></el-input>
          </el-form-item>
          <el-form-item label="实测最高水位" prop="highestWaterLevel">
            <el-input size="mini" v-model="data.highestWaterLevel" auto-complete="off"></el-input>
          </el-form-item>
          <el-form-item label="实测最高水位时间" prop="highestWaterTime">
            <el-date-picker type="date" placeholder="实测最高水位时间" v-model="data.highestWaterTime"></el-date-picker>
          </el-form-item>
          <el-form-item label="实测最低水位" prop="lowWaterLevel">
            <el-input size="mini" v-model="data.lowWaterLevel" auto-complete="off"></el-input>
          </el-form-item>
          <el-form-item label="实测最低水位时间" prop="lowWaterTime">
            <el-date-picker type="date" placeholder="实测最低水位时间" v-model="data.lowWaterTime"></el-date-picker>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button @click.native="addFormVisible = false">取消</el-button>
          <el-button type="primary" :loading="loading" @click.native="addSubmit">提交</el-button>
        </div>
      </el-dialog>
    </el-col>
  </span>
</template>
<script>
  import api from '@/api/apiGaugingStation';

  export default {
    //属性，父组件传参
    props: {
      //按钮图标
      icon:{
        type: String,
        default: ''
      },
      //按钮类型
      type:{
        type: String,
        default: ''
      },
      //按钮大小
      size:{
        type: String,
        default: ''
      },
      //编辑的参数
      data:{
        type: Object,
        default() {
          return {};
        }
      },
      //执行成功回调
      call:{
        type: Function,
        default:function (){}
      },
      //按钮、表单标题
      title:{
        type: String,
        default: '新增'
      }
    },
    data() {
      return {
        loading: false,
        //新增相关数据
        addFormVisible: false,//新增界面是否显示
        addFormRules: {
          hName: [
            {required: true, message: '请输入测站名称', trigger: 'blur'}
          ],
          hCode: [
            {required: true, message: '请输入测站编码', trigger: 'blur'}
          ],
          rSystem: [
            {required: true, message: '请输入水系', trigger: 'blur'}
          ],
          longitude: [
            {required: true, message: '请输入经度', trigger: 'blur'}
          ],
          latitude: [
            {required: true, message: '请输入纬度', trigger: 'blur'}
          ],
          highestWaterLevel: [
            {required: true, message: '请输入实测最高水位', trigger: 'blur'}
          ],
          highestWaterTime: [
            {required: true, message: '请输入实测最高水位时间', trigger: 'blur'}
          ],
          lowWaterLevel: [
            {required: true, message: '请输入实测最低水位', trigger: 'blur'}
          ],
          lowWaterTime: [
            {required: true, message: '请输入实测最低水位时间', trigger: 'blur'}
          ],
        },

      }
    },
    methods: {
      showAddDialog: function () {
        this.addFormVisible = true;
      },
      //新增
      addSubmit: function () {
        let that = this;
        this.$refs. addForm.validate((valid) => {
          if (valid) {
            that.loading = true;
            let params = Object.assign({}, this.data);
            if (params.id) {
              //编辑
              api.update(params, (result) => {
                that.loading = false;
                if (result && result.code == '0') {
                  that.$message.success({showClose: true, message: '修改成功', duration: 2000});
                  that.$refs['addForm'].resetFields();
                  that.addFormVisible = false;
                  that.call();
                } else {
                  that.$message. error({showClose: true, message: result.msg, duration: 2000});
                }
              });
            } else {
              //新增
              api.insert(params, (result) => {
                that.loading = false;
                if (result && result.code == '0') {
                  that.$message.success({showClose: true, message: '新增成功', duration: 2000});
                  that.$refs['addForm'].resetFields();
                  that.addFormVisible = false;
                  that.call();
                } else {
                  that.$message. error({showClose: true, message: result.msg, duration: 2000});
                }
              });
            }
          }
        });
      },
    },
    mounted() {
    }
  }
</script>

