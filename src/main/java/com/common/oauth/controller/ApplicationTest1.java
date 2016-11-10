package com.common.oauth.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.oauth.model.Sensor;


/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-12-22
 * <p>Version: 1.0
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
@RestController
public class ApplicationTest1 {
	
	//http://127.0.0.1:8080/alarm/getSensor1
    @RequestMapping("/alarm/getSensor1")
    private Sensor getSensor1() {
    	Sensor sensor = new Sensor();
    	sensor.setsAlias("---------------setsAlias");
    	sensor.seteId("seteId");
    	sensor.setsNo("setsNo");
    	sensor.setsHisUrl("setsHisUrl");
        return sensor;
    }
}
