package com.xmz.protfolio.web.administrators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebAdministratorsApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdministratorsApplication.class, args);
    }
}
