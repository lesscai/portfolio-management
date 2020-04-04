package com.xmz.protfolio.service.bonds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.xmz.protfolio.service.bonds.mapper")
public class ServiceBondsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBondsApplication.class, args);
    }
}
