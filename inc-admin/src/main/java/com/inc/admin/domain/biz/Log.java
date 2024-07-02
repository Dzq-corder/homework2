package com.inc.admin.domain.biz;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inc.admin.domain.sys.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 
 * 表名：log
 * @author tanzibiao
 * @date 2024-07-01 21:05:07
 */
public class Log extends BaseEntity {
    private Integer id;

    /**用户id*/
    private String userId;

    /**日志时间*/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date logTime;

    /**信息*/
    private String logMessage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage == null ? null : logMessage.trim();
    }
}