package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.HydrologicStation;
import java.util.List;

/**
 * 管理 service
 * @author tanzibiao
 * @date 2024-07-01 21:00:08
*/
public interface HydrologicStationService {
    /**
     * 分页查询
     */
    PageInfo<HydrologicStation> listByPage(HydrologicStation req);

    /**
     * 查询列表
     */
    List<HydrologicStation> getList(HydrologicStation req);

    /**
     * 单个查询
     */
    HydrologicStation getOne(HydrologicStation req);

    /**
     * 新增
     */
    int insert(HydrologicStation req);

    /**
     * 根据主键修改
     */
    int update(HydrologicStation req);

    /**
     * 根据主键删除
     */
    int delete(Integer id);
}