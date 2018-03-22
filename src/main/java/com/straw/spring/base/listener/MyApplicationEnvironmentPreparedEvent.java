package com.straw.spring.base.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author fengzy
 * @date 3/22/2018
 */
public class MyApplicationEnvironmentPreparedEvent implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("ApplicationEnvironmentPreparedEvent 应该是第二");
    }
}
