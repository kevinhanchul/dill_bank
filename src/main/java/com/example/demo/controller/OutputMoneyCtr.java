package com.example.demo.controller;
import com.example.demo.service.OutputMoneySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("")
public class OutputMoneyCtr {
    @Autowired
    private OutputMoneySvc outputMoneySvc;

    @PostMapping("outputMoneyCtr")
    public void outputMoney(@RequestBody Map<String, Object> paraMap){
        outputMoneySvc.outputMoney();
    }
}
