package com.guojian.springcloud.service.impl;

import com.guojian.springcloud.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author James Guo
 * @date 2021/4/14  14:37
 */
@Component
public class FallBack implements HelloService {

    @Override
    public String test() {
        return "远程服务暂时不可用";
    }
}
