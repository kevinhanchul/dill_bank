package com.example.demo.service;

import com.example.demo.dao.MakeAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MakeAccountSvc {
    @Autowired
    private MakeAccountDao makeAccountDao;

    public void makeAccount(){
        makeAccountDao.makeAccount();
    }
}
