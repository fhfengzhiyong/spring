package com.straw.spring.base.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author fengzy
 * @date 3/22/2018
 */
public class MyListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("系统启动了,"+event.getTimestamp());
    }
}
