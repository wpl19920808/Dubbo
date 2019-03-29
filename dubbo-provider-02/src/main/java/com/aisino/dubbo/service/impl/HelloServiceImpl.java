package com.aisino.dubbo.service.impl;

import com.aisino.dubbo.service.HelloService;

public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
