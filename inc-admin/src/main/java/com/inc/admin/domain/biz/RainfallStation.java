package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 
 * 表名：rainfall_station
 * @author tanzibiao
 * @date 2024-07-01 20:32:25
 */
public class RainfallStation extends BaseEntity {
    private Integer id;

    /**测站名称*/
    private String hName;

    /**测站编码*/
    private String hCode;

    /**水系*/
    private String rSystem;

    /**经度*/
    private Double longitude;

    /**纬度*/
    private Double latitude;

    /**多年平均降雨量（mm）*/
    private Double avgFall;

    /**实测年最大降雨量（mm）*/
    private Double maxFall;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName == null ? null : hName.trim();
    }

    public String gethCode() {
        return hCode;
    }

    public void sethCode(String hCode) {
        this.hCode = hCode == null ? null : hCode.trim();
    }

    public String getrSystem() {
        return rSystem;
    }

    public void setrSystem(String rSystem) {
        this.rSystem = rSystem == null ? null : rSystem.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getAvgFall() {
        return avgFall;
    }

    public void setAvgFall(Double avgFall) {
        this.avgFall = avgFall;
    }

    public Double getMaxFall() {
        return maxFall;
    }

    public void setMaxFall(Double maxFall) {
        this.maxFall = maxFall;
    }
}