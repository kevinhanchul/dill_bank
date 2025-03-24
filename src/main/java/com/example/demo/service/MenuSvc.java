package com.example.demo.service;

import com.example.demo.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MenuSvc {
    @Autowired
    private MenuDao menuDao;

    public void menu(){
        menuDao.menu();
    }
}
