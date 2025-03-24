package com.example.demo.dao;
import org.apache.ibatis.annotations.Mapper;
import java.util.Map;

@Mapper
public interface OutputMoneyDao {
    void outputMoney();
}
