package com.straw.spring.base.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;

/**
 * @author fengzy
 * @date 3/22/2018
 */
public class MyApplicationStartingEvent extends ApplicationStartingEvent {
    /**
     * Create a new {@link ApplicationStartingEvent} instance.
     *
     * @param application the current application
     * @param args        the arguments the application is running with
     */
    public MyApplicationStartingEvent(SpringApplication application, String[] args) {
        super(application, args);
        System.out.println("这里有个事件,MyApplicationStartingEvent  ///");
    }
}
