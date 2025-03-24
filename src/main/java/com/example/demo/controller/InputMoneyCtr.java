package com.example.demo.controller;
import com.example.demo.service.InputMoneySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("")
public class InputMoneyCtr {
    @Autowired
    private InputMoneySvc inputMoneySvc;

    @PostMapping("inputMoneyCtr")
    public void inputMoney(@RequestBody Map<String, Object> paraMap){
        inputMoneySvc.inputMoney();
    }
}
