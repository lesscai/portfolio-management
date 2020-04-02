package com.xmz.protfolio.web.bondsbill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebBondsbillApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebBondsbillApplication.class, args);
    }
}
