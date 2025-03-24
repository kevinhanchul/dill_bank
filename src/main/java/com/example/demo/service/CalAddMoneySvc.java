package com.example.demo.service;

import com.example.demo.dao.CalAddMoneyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CalAddMoneySvc {
    @Autowired
    private CalAddMoneyDao calAddMoneyDao;

    public void calAddMoney(){
        calAddMoneyDao.calAddMoney();
    }
}
