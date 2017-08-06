package com.cn.ssm.pojo;

import java.util.Date;

public class PackageABC {
    private String tcId;

    private Float monthlyRent;

    private Integer preferential;

    private Date startData;

    private Date endData;

    public String getTcId() {
        return tcId;
    }

    public void setTcId(String tcId) {
        this.tcId = tcId == null ? null : tcId.trim();
    }

    public Float getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Float monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public Integer getPreferential() {
        return preferential;
    }

    public void setPreferential(Integer preferential) {
        this.preferential = preferential;
    }

    public Date getStartData() {
        return startData;
    }

    public void setStartData(Date startData) {
        this.startData = startData;
    }

    public Date getEndData() {
        return endData;
    }

    public void setEndData(Date endData) {
        this.endData = endData;
    }
}