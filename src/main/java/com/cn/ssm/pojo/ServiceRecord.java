package com.cn.ssm.pojo;

import java.util.Date;

public class ServiceRecord {
    private String serviceId;

    private Integer type;

    private Date dealTime;

    private String serviceStaff;

    private String detail;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getServiceStaff() {
        return serviceStaff;
    }

    public void setServiceStaff(String serviceStaff) {
        this.serviceStaff = serviceStaff == null ? null : serviceStaff.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}