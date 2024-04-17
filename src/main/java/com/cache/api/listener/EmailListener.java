package com.cache.api.listener;

import com.cache.api.dto.AccountObj;
import com.google.common.eventbus.Subscribe;

public class EmailListener {

    // 監聽器
    @Subscribe
    public void onEmailSend(AccountObj event) {
        System.out.println("發送郵件至 " + event.getMail());
    }
}
