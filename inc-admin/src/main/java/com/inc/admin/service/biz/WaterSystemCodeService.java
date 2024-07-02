package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.WaterSystemCode;
import java.util.List;

/**
 * 管理 service
 * @author tanzibiao
 * @date 2024-07-01 21:12:45
*/
public interface WaterSystemCodeService {
    /**
     * 根据code获取名称
     */
    String getName(String code);

    /**
     * 分页查询
     */
    PageInfo<WaterSystemCode> listByPage(WaterSystemCode req);

    /**
     * 查询列表
     */
    List<WaterSystemCode> getList(WaterSystemCode req);

    /**
     * 单个查询
     */
    WaterSystemCode getOne(WaterSystemCode req);

    /**
     * 新增
     */
    int insert(WaterSystemCode req);

    /**
     * 根据主键修改
     */
    int update(WaterSystemCode req);

    /**
     * 根据主键删除
     */
    int delete(Integer id);
}