package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TetsController {

    @RequestMapping("/")
    public String test(){

        String s = "jjj;";
        return "hello world!!!!";
    }
}
