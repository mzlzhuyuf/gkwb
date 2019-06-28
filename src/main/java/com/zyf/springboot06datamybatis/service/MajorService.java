package com.zyf.springboot06datamybatis.service;

import com.zyf.springboot06datamybatis.bean.Major;
import com.zyf.springboot06datamybatis.bean.MajorLocationVO;
import com.zyf.springboot06datamybatis.bean.dto.MajorLocationDTO;
import com.zyf.springboot06datamybatis.dao.MajorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hero
 * @description com.zyf.springboot06datamybatis.service
 * @date 2019/6/26
 */
@Service
public class MajorService {
    @Autowired
    MajorDao majorDao;

    public MajorLocationVO queryMajorByCondition(List<String> batchListNumber, String subject, List<String> schoolNameList, List<String> majorList, List<String> provinceList, List<String> cityList, Integer minScore, Integer maxScore, String year, String fee, Boolean group) {
        List<String> batchList = new ArrayList();
        for (String batch : batchListNumber) {
            if (batch.equals("提前")) {
                batchList.add("提前");
            } else if (batch.equals("本科一批")) {
                batchList.add("本科一批");
            } else if (batch.equals("本科二批")) {
                batchList.add("本科二批");
            } else if (batch.equals("高职高专")) {
                batchList.add("高职高专");
            }
        }

        int nullTotal = 0;
        if (!CollectionUtils.isEmpty(provinceList)) {
            nullTotal++;
        }
        if (!CollectionUtils.isEmpty(cityList)) {
            nullTotal++;
        }
        List<MajorLocationDTO> majorLocationDTOList = new ArrayList<>();
        if (nullTotal == 1) {
            if (group == true) {
                majorLocationDTOList = majorDao.selectByConditionGroupBySchoolOnlyProvinceOrCity(batchList, subject, schoolNameList, majorList, provinceList, cityList, minScore, maxScore, year, fee);
            } else {
                majorLocationDTOList = majorDao.selectByConditionOnlyProvinceOrCity(batchList, subject, schoolNameList, majorList, provinceList, cityList, minScore, maxScore, year, fee);
            }
        } else {
            if (group == true) {
                majorLocationDTOList = majorDao.selectByConditionGroupBySchool(batchList, subject, schoolNameList, majorList, provinceList, cityList, minScore, maxScore, year, fee);
            } else {
                majorLocationDTOList = majorDao.selectByCondition(batchList, subject, schoolNameList, majorList, provinceList, cityList, minScore, maxScore, year, fee);
            }
        }


        MajorLocationVO majorLocationVO = new MajorLocationVO();
        majorLocationVO.setMajorLocationDTOList(majorLocationDTOList);
        majorLocationVO.setTotal(majorLocationDTOList.size());
        return majorLocationVO;
    }
}
