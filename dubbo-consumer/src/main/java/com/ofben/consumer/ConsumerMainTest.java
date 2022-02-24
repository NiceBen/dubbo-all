package com.ofben.consumer;

import com.ofben.api.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerMainTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        ioc.start();

        OrderService orderService = ioc.getBean(OrderService.class);
        orderService.initOrder("hello");

        System.in.read();
    }
}
