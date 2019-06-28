package com.zyf.springboot06datamybatis.dao;

import com.zyf.springboot06datamybatis.bean.School;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SchoolDao {
   List<School> queryAll();

   int addSchool(School school);
}
