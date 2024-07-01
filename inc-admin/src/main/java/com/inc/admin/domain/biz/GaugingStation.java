package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;
import java.util.Date;

/**
 * 
 * 表名：gauging_station
 * @author tanzibiao
 * @date 2024-07-01 20:53:01
 */
public class GaugingStation extends BaseEntity {
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

    /**实测最高水位*/
    private Double highestWaterLevel;

    /**实测最高水位时间*/
    private Date highestWaterTime;

    /**实测最低水位*/
    private Double lowWaterLevel;

    /**实测最低水位时间*/
    private Date lowWaterTime;

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

    public Double getHighestWaterLevel() {
        return highestWaterLevel;
    }

    public void setHighestWaterLevel(Double highestWaterLevel) {
        this.highestWaterLevel = highestWaterLevel;
    }

    public Date getHighestWaterTime() {
        return highestWaterTime;
    }

    public void setHighestWaterTime(Date highestWaterTime) {
        this.highestWaterTime = highestWaterTime;
    }

    public Double getLowWaterLevel() {
        return lowWaterLevel;
    }

    public void setLowWaterLevel(Double lowWaterLevel) {
        this.lowWaterLevel = lowWaterLevel;
    }

    public Date getLowWaterTime() {
        return lowWaterTime;
    }

    public void setLowWaterTime(Date lowWaterTime) {
        this.lowWaterTime = lowWaterTime;
    }
}