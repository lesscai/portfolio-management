package com.xmz.protfolio.service.card;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceCardApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCardApplication.class, args);
    }
}
