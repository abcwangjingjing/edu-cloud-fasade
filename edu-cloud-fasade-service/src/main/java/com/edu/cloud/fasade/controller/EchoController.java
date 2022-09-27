package com.edu.cloud.fasade.controller;

import com.edu.center.api.IEchoApi;
import com.edu.center.api.IHelloApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @Autowired
    IEchoApi iEchoApi;

    @GetMapping("/echo")
    public String setHelloApi() {
        return iEchoApi.echo("“快乐暑促");
    }

    @PostMapping("/echoPost")
    public String setHelloPost() {
        return iEchoApi.echoPost("“快乐暑促","结束楼");
    }


}
