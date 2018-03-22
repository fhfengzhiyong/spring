package com.straw.spring.base.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyBean {
    @Autowired
    public MyBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        System.out.println("--------------de:"+debug);
        List<String> files = args.getNonOptionArgs();
        if (files != null) {
            for (String s : files) {
                System.out.println(s);
            }
        }
// if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
    }
}