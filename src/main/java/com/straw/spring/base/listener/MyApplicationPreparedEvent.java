package com.straw.spring.base.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author fengzy
 * @date 3/22/2018
 */
public class MyApplicationPreparedEvent implements ApplicationListener<ApplicationPreparedEvent>{
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println(" MyApplicationPreparedEvent  refresh之前,bean 被load之后." );
    }
}
