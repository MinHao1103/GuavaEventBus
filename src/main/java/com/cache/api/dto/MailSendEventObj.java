package com.cache.api.dto;

public class MailSendEventObj {

    String mail;

    public MailSendEventObj() {
    }

    public MailSendEventObj(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
