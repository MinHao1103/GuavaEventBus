package com.cache.api.listener;

import com.cache.api.dto.SMSSendEventObj;
import com.google.common.eventbus.Subscribe;

public class SMSListener {

    // 監聽器
    @Subscribe
    public void onSMSSend(SMSSendEventObj event) {
        System.out.println("發送簡訊至 " + event.getPhone());
    }
}