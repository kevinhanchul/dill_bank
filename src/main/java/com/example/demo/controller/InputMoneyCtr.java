package com.example.demo.controller;
import com.example.demo.service.SellSubwaySvc;
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
    private SellSubwaySvc sellSubwaySvc;

    @PostMapping("sellsubwayctr")
    public void sellsubwayctr(@RequestBody Map<String, Object> paraMap){
        sellSubwaySvc.sellSubway(paraMap);
    }
}
