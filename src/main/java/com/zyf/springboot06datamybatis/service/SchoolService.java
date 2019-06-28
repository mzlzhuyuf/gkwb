package com.zyf.springboot06datamybatis.service;

import com.zyf.springboot06datamybatis.bean.School;
import com.zyf.springboot06datamybatis.dao.SchoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hero
 * @description com.zyf.springboot06datamybatis.service
 * @date 2019/6/25
 */
@Service
public class SchoolService {
    @Autowired
    SchoolDao schoolDao;
    public List<School> getAll() {
        return schoolDao.queryAll();
    }
}
