package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.GaugingStation;
import java.util.List;

/**
 * 管理 service
 * @author tanzibiao
 * @date 2024-07-01 20:53:01
*/
public interface GaugingStationService {
    /**
     * 分页查询
     */
    PageInfo<GaugingStation> listByPage(GaugingStation req);

    /**
     * 查询列表
     */
    List<GaugingStation> getList(GaugingStation req);

    /**
     * 单个查询
     */
    GaugingStation getOne(GaugingStation req);

    /**
     * 新增
     */
    int insert(GaugingStation req);

    /**
     * 根据主键修改
     */
    int update(GaugingStation req);

    /**
     * 根据主键删除
     */
    int delete(Integer id);
}