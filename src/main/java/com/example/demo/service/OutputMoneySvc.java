package com.example.demo.service;

import com.example.demo.dao.OutputMoneyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OutputMoneySvc {
    @Autowired
    private OutputMoneyDao outputMoneyDao;

    public void outputMoney(){
        outputMoneyDao.outputMoney();
    }
}
