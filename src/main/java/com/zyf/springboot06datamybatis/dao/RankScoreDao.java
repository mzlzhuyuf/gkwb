package com.zyf.springboot06datamybatis.dao;

import com.zyf.springboot06datamybatis.bean.RankScore;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RankScoreDao {
    int deleteByPrimaryKey(Integer id);

    int insert(RankScore record);

    int insertSelective(RankScore record);

    RankScore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RankScore record);

    int updateByPrimaryKey(RankScore record);
}