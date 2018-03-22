package com.straw.spring.base.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationReadyEvent implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("MyApplicationReadyEvent 最后调用:"+applicationReadyEvent.getSpringApplication().getWebApplicationType());

    }
}
