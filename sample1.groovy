sellSubway.html


        <!DOCTYPE html>
        <html lang="en">
        <head>
        <meta charset="UTF-8">
        <title>Title</title>
</head>
        <body>
        <form id="sellSubwayForm">
        아이디<input type="text" id="userId" value="hch728"><br>
        구간<input type="text" id="rideArea" value="9"><br>
        요금<input type="text" id="subWayFee" value="1200"><br>

        <input type="submit" value="확인" onclick="fn_abc()">

        </form>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script>


        function fn_abc(){
    alert("확인완료11");

    $.ajax({
        url: "outputMoneyCtr",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify({}),
        success: function(result) {
            <!--            $("#result").text(result.result);-->
                    alert("확인완료");
        },
        error: function(error) {
            alert("Error: " + error.responseText);
        }
    });
}





$("#sellSubwayForm").on("submit", function(event) {
    event.preventDefault();
    var subwayInfo = {
        userId: $("#userId").val(),
        rideArea: $("#rideArea").val(),
        subWayFee: $("#subWayFee").val()
    };

    $.ajax({
        url: "sellsubwayctr",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(subwayInfo),
        success: function(result) {
            <!--            $("#result").text(result.result);-->
                    alert("확인완료");
        },
        error: function(error) {
            alert("Error: " + error.responseText);
        }
    });
});

</script>
</body>


        resources/mappers 폴더에 Mapper.xml 파일이 있는지 확인하세요.


sellSubwayMap.xml



        <?xml version="1.0" encoding="UTF-8"?>
        <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
        <mapper namespace="com.example.demo.dao.SellSubwayDao">
        <insert id="sellSubway" parameterType="java.util.Map">
        INSERT INTO ch_test1 (col1, col2, col3) VALUES (#{userId}, #{rideArea}, #{subWayFee})
<!--        INSERT INTO ch_test1 (col1, col2, col3) VALUES (1, 2, 3)-->
        </insert>
</mapper>


        SellSubwayDao


package com.example.demo.dao;
import org.apache.ibatis.annotations.Mapper;
import java.util.Map;

@Mapper
public interface SellSubwayDao {
    void sellSubway(Map<String, Object> paraMap);
}


SellSubwaySvc




package com.example.demo.service;

import com.example.demo.dao.SellSubwayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SellSubwaySvc {
    @Autowired
    private SellSubwayDao sellSubwayDao;

    public void sellSubway(Map<String, Object> paraMap){
        sellSubwayDao.sellSubway(paraMap);
    }
}


SellSubwayCtr




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
public class SellSubwayCtr {
    @Autowired
    private SellSubwaySvc sellSubwaySvc;

    @PostMapping("sellsubwayctr")
    public void sellsubwayctr(@RequestBody Map<String, Object> paraMap){
        sellSubwaySvc.sellSubway(paraMap);
    }
}


SellSubway



package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SellSubway {
    @GetMapping("sellSubway")
    public String sellSubway(){
        return "sellSubway";
    }
}





