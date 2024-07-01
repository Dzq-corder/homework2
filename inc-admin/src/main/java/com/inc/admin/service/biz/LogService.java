package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Log;
import java.util.List;

/**
 * 管理 service
 * @author tanzibiao
 * @date 2024-07-01 21:05:07
*/
public interface LogService {
    /**
     * 分页查询
     */
    PageInfo<Log> listByPage(Log req);

    /**
     * 查询列表
     */
    List<Log> getList(Log req);

    /**
     * 单个查询
     */
    Log getOne(Log req);

    /**
     * 新增
     */
    int insert(Log req);

    /**
     * 根据主键修改
     */
    int update(Log req);

    /**
     * 根据主键删除
     */
    int delete(Integer id);
}