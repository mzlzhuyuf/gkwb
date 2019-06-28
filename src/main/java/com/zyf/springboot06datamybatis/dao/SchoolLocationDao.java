package com.zyf.springboot06datamybatis.dao;

import com.zyf.springboot06datamybatis.bean.SchoolLocation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SchoolLocationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolLocation record);

    int insertSelective(SchoolLocation record);

    SchoolLocation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolLocation record);

    int updateByPrimaryKey(SchoolLocation record);
}