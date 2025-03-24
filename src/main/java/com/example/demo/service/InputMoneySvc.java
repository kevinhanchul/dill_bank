package com.example.demo.service;

import com.example.demo.dao.InputMoneyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class InputMoneySvc {
    @Autowired
    private InputMoneyDao inputMoneyDao;

    public void inputMoney(){
        inputMoneyDao.inputMoney();
    }
}
