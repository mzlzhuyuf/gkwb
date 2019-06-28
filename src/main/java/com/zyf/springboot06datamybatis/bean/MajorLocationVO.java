package com.zyf.springboot06datamybatis.bean;

import com.zyf.springboot06datamybatis.bean.dto.MajorLocationDTO;

import java.util.List;

/**
 * @author Hero
 * @description com.zyf.springboot06datamybatis.bean
 * @date 2019/6/26
 */
public class MajorLocationVO {
    private List<MajorLocationDTO> majorLocationDTOList;
    private Integer total;

    public List<MajorLocationDTO> getMajorLocationDTOList() {
        return majorLocationDTOList;
    }

    public void setMajorLocationDTOList(List<MajorLocationDTO> majorLocationDTOList) {
        this.majorLocationDTOList = majorLocationDTOList;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
