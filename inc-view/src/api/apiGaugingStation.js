import httpClient from '../utils/httpClient';

export default {

  //分页查询
  listByPage: (data,callback) => {
    return httpClient('/gaugingStation/listByPage', {method:'post',data,}, callback);
  },

  //添加
  insert: (data,callback) => {
    return httpClient('/gaugingStation/insert', {method:'post',data,}, callback);
  },

  //修改
  update: (data,callback) => {
    return httpClient('/gaugingStation/update', {method:'post',data,}, callback);
  },

  //删除
  delete: (data,callback) => {
    return httpClient('/gaugingStation/delete', {method:'post',params:data,}, callback);
  },
}
