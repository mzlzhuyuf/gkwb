package com.zyf.springboot06datamybatis.controller;

import com.zyf.springboot06datamybatis.bean.School;
import com.zyf.springboot06datamybatis.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("/testHtml")
    public String testStringList() {
        return "queryMajor.html";
    }
}
