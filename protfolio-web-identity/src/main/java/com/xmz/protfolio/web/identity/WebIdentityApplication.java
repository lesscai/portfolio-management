package com.xmz.protfolio.web.identity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebIdentityApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebIdentityApplication.class, args);
    }
}
