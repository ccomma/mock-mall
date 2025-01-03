package com.mockmall.tradeplatform;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "com.mockmall.tradeplatform")
@SpringBootApplication
public class TradePlatformProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradePlatformProviderApplication.class, args);
    }

}
