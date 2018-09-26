package com.example.springboot.demospringboot.controller;

import com.example.springboot.demospringboot.model.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({Config.class})
public class DemoController {
    Logger logger = LoggerFactory.getLogger(DemoController.class);



    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        return "asdasd";
    }

//    @RequestMapping(value = "/config", method = RequestMethod.GET)
//    public Config config() {
//        logger.info(config.toString());
//        return config;
//    }
}