package com.example.demo.controller;
import com.example.demo.service.ConfirmPaperSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("")
public class ConfirmPaperCtr {
    @Autowired
    private ConfirmPaperSvc confirmPaperSvc;

    @PostMapping("confirmPaperCtr")
    public void confirmPaper(@RequestBody Map<String, Object> paraMap){
        confirmPaperSvc.confirmPaper();
    }
}
