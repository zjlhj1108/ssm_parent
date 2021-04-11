package com.zjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
    @RequestMapping("/testRedis")

    public String testRedis(){
        return "redis";
    }
}
