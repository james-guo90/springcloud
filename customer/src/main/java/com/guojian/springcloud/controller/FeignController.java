package com.guojian.springcloud.controller;

import com.guojian.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author James Guo
 * @date 2021/4/14  10:20
 */
@RestController
public class FeignController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/to-hello")
    public String hello(){
        return helloService.test();
    }
}
