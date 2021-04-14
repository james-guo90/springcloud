package com.guojian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider8091Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8091Application.class, args);
    }

}
