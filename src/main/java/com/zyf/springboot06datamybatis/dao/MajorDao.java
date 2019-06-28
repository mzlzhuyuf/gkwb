package com.zyf.springboot06datamybatis.dao;

import com.zyf.springboot06datamybatis.bean.Major;
import com.zyf.springboot06datamybatis.bean.dto.MajorLocationDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
@Mapper
public interface MajorDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);

    List<MajorLocationDTO> selectByCondition(@Param("batchList") List<String> batchList, @Param("subject") String subject,
                                             @Param(value = "schoolNameList") List<String> schoolNameList, @Param(value = "majorList") List<String> majorList,
                                             @Param(value = "provinceList") List<String> provinceList, @Param(value = "cityList") List<String> cityList,
                                             @Param(value = "minScore") Integer minScore, @Param(value = "maxScore") Integer maxScore,
                                             @Param("year") String year, @Param("fee") String fee);

    List<MajorLocationDTO> selectByConditionGroupBySchool(@Param("batchList") List<String> batchList, @Param("subject") String subject,
                                             @Param(value = "schoolNameList") List<String> schoolNameList, @Param(value = "majorList") List<String> majorList,
                                             @Param(value = "provinceList") List<String> provinceList, @Param(value = "cityList") List<String> cityList,
                                             @Param(value = "minScore") Integer minScore, @Param(value = "maxScore") Integer maxScore,
                                             @Param("year") String year, @Param("fee") String fee);

    List<MajorLocationDTO> selectByConditionOnlyProvinceOrCity(@Param("batchList") List<String> batchList, @Param("subject") String subject,
                                             @Param(value = "schoolNameList") List<String> schoolNameList, @Param(value = "majorList") List<String> majorList,
                                             @Param(value = "provinceList") List<String> provinceList, @Param(value = "cityList") List<String> cityList,
                                             @Param(value = "minScore") Integer minScore, @Param(value = "maxScore") Integer maxScore, @Param("year") String year, @Param("fee") String fee);

    List<MajorLocationDTO> selectByConditionGroupBySchoolOnlyProvinceOrCity(@Param("batchList") List<String> batchList, @Param("subject") String subject,
                                                               @Param(value = "schoolNameList") List<String> schoolNameList, @Param(value = "majorList") List<String> majorList,
                                                               @Param(value = "provinceList") List<String> provinceList, @Param(value = "cityList") List<String> cityList,
                                                               @Param(value = "minScore") Integer minScore, @Param(value = "maxScore") Integer maxScore, @Param("year") String year, @Param("fee") String fee);

}