package com.cache.api.listener;

import com.cache.api.dto.AccountObj;
import com.google.common.eventbus.Subscribe;

public class SMSListener {

    // 監聽器
    @Subscribe
    public void onSMSSend(AccountObj event) {
        System.out.println("發送簡訊至 " + event.getAccount());
    }
}