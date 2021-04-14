package com.guojian.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author James Guo
 * @date 2021/4/14  10:15
 */
@FeignClient(name = "PROVIDER")
public interface HelloService {
    @RequestMapping("/hello")
    public String test();
}
