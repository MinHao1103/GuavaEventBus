package com.cache.api.jersey;

import com.cache.api.listener.EmailListener;
import com.cache.api.listener.SMSListener;
import com.cache.api.service.AccountService;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.common.eventbus.EventBus;
import org.glassfish.jersey.server.ResourceConfig;

public class APIApplication extends ResourceConfig {

    private static EventBus eventBus = new EventBus();

    public static EventBus getEventBus() {
        return eventBus;
    }

    public APIApplication() {
        register(AccountService.class);
        register(JacksonJsonProvider.class);

        // 將 EmailListener 與 SMSListener 註冊到 Guava 的 EventBus
        eventBus.register(new EmailListener());
        eventBus.register(new SMSListener());
    }
}
