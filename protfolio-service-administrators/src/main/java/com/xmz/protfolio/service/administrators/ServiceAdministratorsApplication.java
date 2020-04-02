package com.xmz.protfolio.service.administrators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceAdministratorsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdministratorsApplication.class, args);
    }
}
