package com.example.demo.Member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    //유저의 데이터 수신
public class MemberController {

    @GetMapping("hello")
    public String getHello() {
        return "Hello user!";
    }

    @PostMapping("/join")
    public String join() {
        return "string";
    }

}
