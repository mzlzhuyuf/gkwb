package com.zyf.springboot06datamybatis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Hero
 * @description com.zyf.springboot06datamybatis.config
 * @date 2019/6/25
 */

public class MybatisConfig {
    /*@ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource mybatis() {
        return new Mybatis;
    }*/
}
