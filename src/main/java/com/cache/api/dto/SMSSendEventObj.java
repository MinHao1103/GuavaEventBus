package com.cache.api.dto;

public class SMSSendEventObj {

    String phone;

    public SMSSendEventObj() {
    }

    public SMSSendEventObj(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
