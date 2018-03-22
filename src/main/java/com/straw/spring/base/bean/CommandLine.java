package com.straw.spring.base.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLine   " +args);
    }
}
