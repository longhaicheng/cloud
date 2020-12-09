package com.example.cloudsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudSystemApplication.class, args);
    }

}
