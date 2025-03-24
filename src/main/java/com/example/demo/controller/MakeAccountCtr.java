package com.example.demo.controller;
import com.example.demo.service.MakeAccountSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("")
public class MakeAccountCtr {
    @Autowired
    private MakeAccountSvc makeAccountSvc;

    @PostMapping("makeAccountCtr")
    public void makeAccount(@RequestBody Map<String, Object> paraMap){
        makeAccountSvc.makeAccount();
    }
}
