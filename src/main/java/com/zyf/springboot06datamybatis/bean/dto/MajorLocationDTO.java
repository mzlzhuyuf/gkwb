package com.zyf.springboot06datamybatis.bean.dto;

import com.zyf.springboot06datamybatis.bean.SchoolLocation;

/**
 * @author Hero
 * @description com.zyf.springboot06datamybatis.bean.dto
 * @date 2019/6/26
 */
public class MajorLocationDTO {
    private Integer id;

    private String subject;

    private String batch;

    private String schoolId;

    private String schoolName;

    private String majorId;

    private String majorName;

    private Integer amount;

    private Integer oneOneScore;

    private Integer alreadyAmount;

    private String tuitionFee;

    private String location;

    private String remark;

    private String year;

    private SchoolLocation schoolLocation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId == null ? null : majorId.trim();
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getOneOneScore() {
        return oneOneScore;
    }

    public void setOneOneScore(Integer oneOneScore) {
        this.oneOneScore = oneOneScore;
    }

    public Integer getAlreadyAmount() {
        return alreadyAmount;
    }

    public void setAlreadyAmount(Integer alreadyAmount) {
        this.alreadyAmount = alreadyAmount;
    }

    public String getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(String tuitionFee) {
        this.tuitionFee = tuitionFee == null ? null : tuitionFee.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public SchoolLocation getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(SchoolLocation schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    @Override
    public String toString() {
        return "MajorLocationDTO{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", batch='" + batch + '\'' +
                ", schoolId='" + schoolId + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", majorId='" + majorId + '\'' +
                ", majorName='" + majorName + '\'' +
                ", amount=" + amount +
                ", oneOneScore=" + oneOneScore +
                ", alreadyAmount=" + alreadyAmount +
                ", tuitionFee='" + tuitionFee + '\'' +
                ", location='" + location + '\'' +
                ", remark='" + remark + '\'' +
                ", year='" + year + '\'' +
                ", schoolLocation=" + schoolLocation +
                '}';
    }
}
