package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {


    // 메인 페이지로 이동
    @GetMapping("/")
    public @ResponseBody String index() {
        return "Hello, World!!";
    }
}
