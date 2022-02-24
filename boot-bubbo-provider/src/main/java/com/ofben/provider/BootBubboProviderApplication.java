package com.ofben.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class BootBubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootBubboProviderApplication.class, args);
    }

}
