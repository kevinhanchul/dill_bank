package com.example.demo.service;

import com.example.demo.dao.ConfirmPaperDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ConfirmPaperSvc {
    @Autowired
    private ConfirmPaperDao confirmPaperDao;

    public void confirmPaper(){
        confirmPaperDao.confirmPaper();
    }
}
