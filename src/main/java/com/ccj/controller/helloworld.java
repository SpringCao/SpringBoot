package com.ccj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloworld {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
