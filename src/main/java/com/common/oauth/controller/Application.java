package com.common.oauth.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-12-22
 * <p>Version: 1.0
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
@RestController
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
