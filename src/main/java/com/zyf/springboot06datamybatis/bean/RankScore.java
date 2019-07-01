package com.zyf.springboot06datamybatis.bean;

public class RankScore {
    private Integer id;

    private Integer rank;

    private Integer score;

    private Integer samePeople;

    private Integer totalPeople;

    private String subject;

    private String year;

    public RankScore() {
    }

    public RankScore(String subject, String year) {
        this.subject = subject;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSamePeople() {
        return samePeople;
    }

    public void setSamePeople(Integer samePeople) {
        this.samePeople = samePeople;
    }

    public Integer getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(Integer totalPeople) {
        this.totalPeople = totalPeople;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    @Override
    public String toString() {
        return "RankScore{" +
                "id=" + id +
                ", rank=" + rank +
                ", score=" + score +
                ", samePeople=" + samePeople +
                ", totalPeople=" + totalPeople +
                ", subject='" + subject + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}