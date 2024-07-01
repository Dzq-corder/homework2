package com.inc.admin.domain.biz;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inc.admin.domain.sys.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 
 * 表名：hydrologic_station
 * @author tanzibiao
 * @date 2024-07-01 21:00:08
 */
public class HydrologicStation extends BaseEntity {
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

    /**多年平均径流量(亿m3)*/
    private Double meanAnnualRunoff;

    /**实测最大流量*/
    private Double maximumDischarge;

    /**最大流量测量时间*/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maximumTime;

    /**实测最小流量*/
    private Double minimumDischarge;

    /**最小流量时间*/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minimumTime;

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

    public Double getMeanAnnualRunoff() {
        return meanAnnualRunoff;
    }

    public void setMeanAnnualRunoff(Double meanAnnualRunoff) {
        this.meanAnnualRunoff = meanAnnualRunoff;
    }

    public Double getMaximumDischarge() {
        return maximumDischarge;
    }

    public void setMaximumDischarge(Double maximumDischarge) {
        this.maximumDischarge = maximumDischarge;
    }

    public Date getMaximumTime() {
        return maximumTime;
    }

    public void setMaximumTime(Date maximumTime) {
        this.maximumTime = maximumTime;
    }

    public Double getMinimumDischarge() {
        return minimumDischarge;
    }

    public void setMinimumDischarge(Double minimumDischarge) {
        this.minimumDischarge = minimumDischarge;
    }

    public Date getMinimumTime() {
        return minimumTime;
    }

    public void setMinimumTime(Date minimumTime) {
        this.minimumTime = minimumTime;
    }
}