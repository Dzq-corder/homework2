package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;
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