package com.zyf.springboot06datamybatis.bean;

public class School {
    private Integer id;

    private String subject;

    private String batch;

    private String schoolid;

    private String schoolname;

    private String schoolhref;

    private Integer amount;

    private Integer onetoone;

    private String proportion;

    private Integer predictscore;

    private Integer shouldamount;

    private Integer alreadyamount;

    private Integer lackamount;

    private String regulations;

    private String year;

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
        this.subject = subject;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid == null ? null : schoolid.trim();
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getSchoolhref() {
        return schoolhref;
    }

    public void setSchoolhref(String schoolhref) {
        this.schoolhref = schoolhref == null ? null : schoolhref.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getOnetoone() {
        return onetoone;
    }

    public void setOnetoone(Integer onetoone) {
        this.onetoone = onetoone;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion == null ? null : proportion.trim();
    }

    public Integer getPredictscore() {
        return predictscore;
    }

    public void setPredictscore(Integer predictscore) {
        this.predictscore = predictscore;
    }

    public Integer getShouldamount() {
        return shouldamount;
    }

    public void setShouldamount(Integer shuouldamount) {
        this.shouldamount = shuouldamount;
    }

    public Integer getAlreadyamount() {
        return alreadyamount;
    }

    public void setAlreadyamount(Integer alreadyamount) {
        this.alreadyamount = alreadyamount;
    }

    public Integer getLackamount() {
        return lackamount;
    }

    public void setLackamount(Integer lackamount) {
        this.lackamount = lackamount;
    }

    public String getRegulations() {
        return regulations;
    }

    public void setRegulations(String regulations) {
        this.regulations = regulations == null ? null : regulations.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", batch='" + batch + '\'' +
                ", schoolid='" + schoolid + '\'' +
                ", schoolname='" + schoolname + '\'' +
                ", schoolhref='" + schoolhref + '\'' +
                ", amount=" + amount +
                ", onetoone=" + onetoone +
                ", proportion='" + proportion + '\'' +
                ", predictscore=" + predictscore +
                ", shouldamount=" + shouldamount +
                ", alreadyamount=" + alreadyamount +
                ", lackamount=" + lackamount +
                ", regulations='" + regulations + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}