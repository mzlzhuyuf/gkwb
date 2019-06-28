package com.zyf.springboot06datamybatis.controller;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zyf.springboot06datamybatis.bean.Major;
import com.zyf.springboot06datamybatis.bean.MajorLocationVO;
import com.zyf.springboot06datamybatis.bean.dto.MajorLocationDTO;
import com.zyf.springboot06datamybatis.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hero
 * @description com.zyf.springboot06datamybatis.controller
 * @date 2019/6/26
 */
@RestController
@RequestMapping("/major")
public class MajorController {
    @Autowired
    MajorService majorService;

    /*@RequestMapping(value = "/getMajorByCondition", method = RequestMethod.POST)
    public MajorLocationVO queryMajorByCondition(@RequestParam(value = "batch", required = false) String batch, @RequestParam(value = "subject") String subject,
                                                 @RequestParam(value = "schoolName", required = false) String schoolName, @RequestParam(value = "major", required = false) String major,
                                                 @RequestParam(value = "province", required = false) String province, @RequestParam(value = "city", required = false) String city,
                                                 @RequestParam(value = "minScore", required = false) Integer minScore, @RequestParam(value = "maxScore", required = false) Integer maxScore,
                                                 @RequestParam(value = "year", required = false) String year, @RequestParam(value = "fee", required = false) String fee) {
        String[] majors = major.split(",");
        List<String> majorList = new ArrayList<>();
        for (String m : majors) {
            majorList.add(m);
        }

        String[] schoolNames = schoolName.split(",");
        List<String> schoolNameList = new ArrayList<>();
        for (String schoolname : schoolNames) {
            schoolNameList.add(schoolname);
        }

        String[] provinces = province.split(",");
        List<String> provinceList = new ArrayList<>();
        for (String pro : provinces) {
            provinceList.add(pro);
        }

        String[] citys = city.split(",");
        List<String> cityList = new ArrayList<>();
        for (String c : citys) {
            cityList.add(c);
        }
        return majorService.queryMajorByCondition(batch, subject, schoolNameList, majorList, provinceList, cityList, minScore, maxScore, year, fee);
    }*/
    @RequestMapping(value = "/getMajorByCondition", method = RequestMethod.POST)
    public MajorLocationVO queryMajorByCondition(@RequestParam(value = "jsonString", required = false) String jsonString, @RequestParam(value = "minority", required = false) String minority) {

        JSONObject object = JSONObject.parseObject(jsonString);

        String major = object.getString("majors");
        List<String> majorList = new ArrayList<>();
        if (StringUtils.isEmpty(major)) {

        } else {
            String[] majors = major.split("，");
            for (String m : majors) {
                majorList.add(m);
            }
        }


        String schoolName = object.getString("schools");
        List<String> schoolNameList = new ArrayList<>();
        if (StringUtils.isEmpty(schoolName)) {

        } else {
            String[] schoolNames = schoolName.split("，");
            for (String schoolname : schoolNames) {
                schoolNameList.add(schoolname);
            }
        }


        String province = object.getString("province");
        List<String> provinceList = new ArrayList<>();
        if (StringUtils.isEmpty(province)) {

        } else {
            String[] provinces = province.split("，");
            for (String pro : provinces) {
                provinceList.add(pro);
            }
        }

        String city = object.getString("city");
        List<String> cityList = new ArrayList<>();
        if (StringUtils.isEmpty(city)) {

        } else {
            String[] citys = city.split("，");
            for (String c : citys) {
                cityList.add(c);
            }
        }


        Integer minScore = object.getInteger("minScore");
        Integer maxScore = object.getInteger("maxScore");
        String subject = object.getString("subject");

        String batch = object.getString("batch");
        List<String> batchList = new ArrayList<>();
        if (StringUtils.isEmpty(batch)) {

        } else {
            String[] batchs = batch.split(",");
            for (String bat : batchs) {
                batchList.add(bat);
            }
        }
        Boolean groupBoolean = false;
        if (object.getString("group").equals("true")) {
            groupBoolean = true;
        }
        String year = "2018";
        String fee = null;

        if (minority.equals("true")) {
            majorList.clear();
            majorList.add("少数民族");
        }

        return majorService.queryMajorByCondition(batchList, subject, schoolNameList, majorList, provinceList, cityList, minScore, maxScore, year, fee, groupBoolean);
    }
}
