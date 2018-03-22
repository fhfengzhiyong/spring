package com.straw.spring.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fengzy
 * @date 3/22/2018
 */
@SpringBootApplication
public class ApplicationMain {
    public static void main(String[] args) {
        args = new String[]{"app", "sdf"};
        SpringApplication springApplication = new SpringApplication(ApplicationMain.class);
        springApplication.setWebApplicationType(WebApplicationType.REACTIVE);
        springApplication.run(args);
    }
}
