package com.guojian.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author James Guo
 * @date 2021/4/13  16:02
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Feign的服务提供者";
    }
}
