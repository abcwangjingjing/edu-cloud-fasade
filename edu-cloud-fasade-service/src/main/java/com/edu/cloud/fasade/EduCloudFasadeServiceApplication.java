package com.edu.cloud.fasade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.edu.center.api"})
public class EduCloudFasadeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduCloudFasadeServiceApplication.class, args);
    }

}
