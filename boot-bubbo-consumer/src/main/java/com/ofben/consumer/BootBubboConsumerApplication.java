package com.ofben.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource(locations = "classpath:consumer.xml")
@EnableDubbo
public class BootBubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootBubboConsumerApplication.class, args);
    }

}
