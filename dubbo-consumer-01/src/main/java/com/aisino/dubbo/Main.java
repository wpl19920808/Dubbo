package com.aisino.dubbo;

import com.aisino.dubbo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        String hello = helloService.sayHello("zhangsnan");
        System.out.println(hello);
    }
}
