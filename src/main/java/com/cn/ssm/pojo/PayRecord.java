package com.cn.ssm.pojo;

import java.util.Date;

public class PayRecord {
    private String payrecId;

    private String telId;

    private Float money;

    private Date paytime;

    public String getPayrecId() {
        return payrecId;
    }

    public void setPayrecId(String payrecId) {
        this.payrecId = payrecId == null ? null : payrecId.trim();
    }

    public String getTelId() {
        return telId;
    }

    public void setTelId(String telId) {
        this.telId = telId == null ? null : telId.trim();
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }
}