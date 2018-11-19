package com.naren.democi.com.naren.democi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        return "hello";
    }
}
