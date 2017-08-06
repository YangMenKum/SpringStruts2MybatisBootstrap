package com.cn.ssm.pojo;

import java.util.Date;

public class CallLog {
    private String calllogId;

    private String userId;

    private Date startTime;

    private Date endTime;

    private String called;

    public String getCalllogId() {
        return calllogId;
    }

    public void setCalllogId(String calllogId) {
        this.calllogId = calllogId == null ? null : calllogId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCalled() {
        return called;
    }

    public void setCalled(String called) {
        this.called = called == null ? null : called.trim();
    }
}