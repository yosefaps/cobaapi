package com.example.demo_api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/")
public class userController {

//    @GetMapping(value = "checkAPI")
//    public String checkAPI(){
//        return "haii";
//    }
    @RequestMapping("/")
    public String gethelloworld(){
        return "hello";
    }
}
