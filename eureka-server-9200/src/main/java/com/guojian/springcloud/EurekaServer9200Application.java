package com.guojian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer9200Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer9200Application.class, args);
    }

}
