package com.deploy.jenkins.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servlet {

    @GetMapping(value = "/")
    public String hello() {
        return "hello World";
    }

}
