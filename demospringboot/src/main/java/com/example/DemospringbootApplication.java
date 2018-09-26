package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySource(value={"classpath:application.properties"},encoding = "utf-8")
public class DemospringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemospringbootApplication.class, args);
        System.out.println("123");
    }
}
