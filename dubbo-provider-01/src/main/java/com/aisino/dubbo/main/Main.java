package com.aisino.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();//启动spring容器
        System.in.read();// 表示一直读的状态，相当于容器一直在运行

    }
}
