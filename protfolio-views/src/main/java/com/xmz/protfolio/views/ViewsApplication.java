package com.xmz.protfolio.views;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ViewsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ViewsApplication.class, args);
    }
}
