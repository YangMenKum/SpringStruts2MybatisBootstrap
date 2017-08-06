package com.cn.ssm.pojo;

import java.util.Date;

public class AutomatPayment {
    private String autorecId;

    private String telId;

    private Float money;

    private Date autorecTime;

    public String getAutorecId() {
        return autorecId;
    }

    public void setAutorecId(String autorecId) {
        this.autorecId = autorecId == null ? null : autorecId.trim();
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

    public Date getAutorecTime() {
        return autorecTime;
    }

    public void setAutorecTime(Date autorecTime) {
        this.autorecTime = autorecTime;
    }
}