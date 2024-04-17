package com.cache.api.deledgate;

import com.cache.api.dao.AccountDAO;
import com.cache.api.dto.AccountObj;
import com.cache.api.dto.MailSendEventObj;
import com.cache.api.dto.SMSSendEventObj;
import com.cache.api.jersey.APIApplication;
import com.cache.api.utils.CommonHttpResult;
import com.google.common.eventbus.EventBus;

public class AccountDeledgate {

    public static CommonHttpResult<Boolean> register(AccountObj accountObj) {
        Boolean result = AccountDAO.add(accountObj.getAccount(), accountObj.getPassword());

        // 如果註冊成功，發送簡訊及 Email
        if (result) {
            EventBus eventBus = APIApplication.getEventBus();

            SMSSendEventObj smsSendEventObj = new SMSSendEventObj(accountObj.getAccount());
            eventBus.post(smsSendEventObj); // 發送 SMS 事件

            MailSendEventObj mailSendEventObj = new MailSendEventObj(accountObj.getMail());
            eventBus.post(mailSendEventObj); // 發送事件
        }

        return new CommonHttpResult<Boolean>(0, result);
    }

}
