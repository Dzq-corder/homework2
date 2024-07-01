package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 
 * 表名：water_system_code
 * @author tanzibiao
 * @date 2024-07-01 21:12:45
 */
public class WaterSystemCode extends BaseEntity {
    private Integer id;

    /**编码*/
    private String code;

    /**名称*/
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}