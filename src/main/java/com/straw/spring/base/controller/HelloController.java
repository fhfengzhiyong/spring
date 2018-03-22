package com.straw.spring.base.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengzy
 * @date 3/22/2018
 */
@RestController
public class HelloController {
    @Value("http://www.baidu.com")
    public String name;
    @RequestMapping("/")
    public String index(){
        System.out.println("sd");
        return name;
    }
}
