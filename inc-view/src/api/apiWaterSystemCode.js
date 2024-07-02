import httpClient from '../utils/httpClient';

export default {
  //根据编码查名称
  getName:(data,callback) => {
    return httpClient('/waterSystemCode/getName', {method:'get',data,}, callback);
  },

  //分页查询
  listByPage: (data,callback) => {
    return httpClient('/waterSystemCode/listByPage', {method:'post',data,}, callback);
  },

  //添加
  insert: (data,callback) => {
    return httpClient('/waterSystemCode/insert', {method:'post',data,}, callback);
  },

  //修改
  update: (data,callback) => {
    return httpClient('/waterSystemCode/update', {method:'post',data,}, callback);
  },

  //删除
  delete: (data,callback) => {
    return httpClient('/waterSystemCode/delete', {method:'post',params:data,}, callback);
  },
}
