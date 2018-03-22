package com.straw.spring.base.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author fengzy
 * @date 3/22/2018
 */
public class MyApplicationListener implements ApplicationListener<ApplicationStartingEvent>{

    @Override
    public void onApplicationEvent(ApplicationStartingEvent  event) {
        System.out.println("我是 MyApplicationListener"+event.getSource());
    }
}
