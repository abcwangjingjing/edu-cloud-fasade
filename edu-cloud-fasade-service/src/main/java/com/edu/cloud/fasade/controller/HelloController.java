package com.edu.cloud.fasade.controller;

import com.edu.center.api.IHelloApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    IHelloApi helloApi;

    @GetMapping("/hello")
    public String setHelloApi() {
        return helloApi.hello();
    }


}
