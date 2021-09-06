package com.tuyen.demo.discoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoverserverApplication.class, args);
    }

}
