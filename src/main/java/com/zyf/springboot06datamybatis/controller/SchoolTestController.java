package com.zyf.springboot06datamybatis.controller;

import com.zyf.springboot06datamybatis.bean.School;
import com.zyf.springboot06datamybatis.service.LilinTest;
import com.zyf.springboot06datamybatis.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Hero
 * @description com.zyf.springboot06datamybatis.controller
 * @date 2019/6/25
 */
@Controller
@RequestMapping("/testSchool")
public class SchoolTestController {
    @Autowired
    LilinTest lilinTest;

    @RequestMapping("/testHtml")
    public String testStringList() {
        return "queryMajor.html";
    }

    @RequestMapping(value = "/testLilin", method = RequestMethod.POST)
    @ResponseBody
    public String testLiLin(@RequestParam("username") String username, @RequestParam("age") Integer age) {
        return lilinTest.testLilin(username, age);
    }
}
