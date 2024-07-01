package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.RainfallStation;
import java.util.List;

/**
 * 管理 service
 * @author tanzibiao
 * @date 2024-07-01 20:32:25
*/
public interface RainfallStationService {
    /**
     * 分页查询
     */
    PageInfo<RainfallStation> listByPage(RainfallStation req);

    /**
     * 查询列表
     */
    List<RainfallStation> getList(RainfallStation req);

    /**
     * 单个查询
     */
    RainfallStation getOne(RainfallStation req);

    /**
     * 新增
     */
    int insert(RainfallStation req);

    /**
     * 根据主键修改
     */
    int update(RainfallStation req);

    /**
     * 根据主键删除
     */
    int delete(Integer id);
}