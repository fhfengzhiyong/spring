package com.straw.spring.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengzy
 * @date 3/22/2018
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        System.out.println("sd");

        return "hello fefk分fsd f分ee是s";
    }
}
