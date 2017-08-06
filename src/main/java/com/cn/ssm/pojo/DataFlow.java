package com.cn.ssm.pojo;

import java.util.Date;

public class DataFlow {
    private String dfId;

    private String userId;

    private Float price;

    private Date ordertime;

    public String getDfId() {
        return dfId;
    }

    public void setDfId(String dfId) {
        this.dfId = dfId == null ? null : dfId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }
}