package com.imranmadbar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String apHome() {
        return "Hello World Swagger  application";
    }

//
//    @RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
//    public String sayHello() {
//        return "Swagger Hello World";
//    }



}

