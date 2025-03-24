package com.example.demo.controller;
import com.example.demo.service.CalAddMoneySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("")
public class CalAddMoneyCtr {
    @Autowired
    private CalAddMoneySvc calAddMoneySvc;

    @PostMapping("calAddMoneyCtr")
    public void calAddMoney(@RequestBody Map<String, Object> paraMap){
        calAddMoneySvc.calAddMoney();
    }
}
