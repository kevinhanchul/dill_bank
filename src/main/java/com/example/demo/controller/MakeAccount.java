package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MakeAccount {
    @GetMapping("makeAccount")
    public String makeAccount(){
        return "makeAccount";
    }
}
