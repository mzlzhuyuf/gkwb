package com.zyf.springboot06datamybatis;

import com.zyf.springboot06datamybatis.service.BeanContext;
import com.zyf.springboot06datamybatis.service.CrawerFirst;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;


@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
public class SpringBoot06DataMybatisApplicationTests  {
    @Autowired
    DataSource dataSource;

    @Autowired
    CrawerFirst crawerFirst;

    @Test
    public void contextLoads() throws Exception {
        /*long start = System.currentTimeMillis();
        System.out.println(start);
        //crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/D_10.html", "蒙授理科");
        //普通文科
        new Thread(){
            @Override
            public void run() {
                CrawerFirst crawerFirst= BeanContext.getApplicationContext().getBean(CrawerFirst.class);
                try {
                    crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/A_10.html", "普通文科");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        *//*new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/A_10.html", "普通文科");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }){}.start();*//*
        //普通理科
        new Thread(){
            @Override
            public void run() {
                CrawerFirst crawerFirst= BeanContext.getApplicationContext().getBean(CrawerFirst.class);
                try {
                    crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/B_10.html", "普通理科");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        *//*new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/B_10.html", "普通理科");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }){}.start();*//*
        //蒙授文科
        new Thread(){
            @Override
            public void run() {
                CrawerFirst crawerFirst= BeanContext.getApplicationContext().getBean(CrawerFirst.class);
                try {
                    crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/C_10.html", "蒙授文科");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        *//*new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/C_10.html", "蒙授文科");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }){}.start();*//*
        //蒙授理科

        new Thread(){
            @Override
            public void run() {
                CrawerFirst crawerFirst= BeanContext.getApplicationContext().getBean(CrawerFirst.class);
                try {
                    crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/D_10.html", "蒙授理科");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

        long end = System.currentTimeMillis();
        System.out.println(end - start);*/
/*        crawerFirst.paChong("https://www.nm.zsks.cn/zy_31_2018/B_11.html", "普通理科");
        crawerFirst.paChong("https://www.nm.zsks.cn/zy_31_2018/A_11.html", "普通文科");
        crawerFirst.paChong("https://www.nm.zsks.cn/zy_71_2018/B_11.html", "普通理科");*/
        //crawerFirst.paChong("https://www.nm.zsks.cn/zy_71_2018/A_11.html", "普通文科");
        /*crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/B_10.html", "普通理科");
        crawerFirst.paChong("https://www.nm.zsks.cn/zy_11_61_2018/A_10.html", "普通文科");*/
        //crawerFirst.paChongLocation("");
        /*crawerFirst.paChong("https://www.nm.zsks.cn/zy_21_2018/A_9.html", "普通文科");
        crawerFirst.paChong("https://www.nm.zsks.cn/zy_21_2018/B_9.html", "普通理科");*/
        //crawerFirst.paChong("https://www.nm.zsks.cn/zy_71_2018/C_11.html", "蒙授文科");
        //crawerFirst.paChong("https://www.nm.zsks.cn/zy_71_2018/D_11.html", "蒙授理科");
        //crawerFirst.paChong("https://www.nm.zsks.cn/zy_44_E1_2018/A_4.html", "普通文科");
        //crawerFirst.paChong("https://www.nm.zsks.cn/zy_44_E1_2018/B_4.html", "普通理科");

        //位次爬虫
        /*crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/19tjxx/201906/A.html" ,"普通文科", "2019");
        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/19tjxx/201906/B.html" ,"普通理科", "2019");
        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/19tjxx/201906/C.html" ,"蒙授文科", "2019");
        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/19tjxx/201906/D.html" ,"蒙授理科", "2019");*/

        /*crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/18tjxx/201806/201806-A.html" ,"普通理科", "2018");
        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/18tjxx/201806/201806-B.html" ,"普通理科", "2018");
        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/18tjxx/201806/201806-C.html" ,"蒙授文科", "2018");
        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/18tjxx/201806/201806-D.html" ,"蒙授理科", "2018");

        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/17tjxx/201706/201706-A.html" ,"普通文科", "2017");
        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/17tjxx/201706/201706-B.html" ,"普通理科", "2017");
        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/17tjxx/201706/201706-C.html" ,"蒙授文科", "2017");
        crawerFirst.paChongRank("https://www.nm.zsks.cn/fzlm/17tjxx/201706/201706-D.html" ,"蒙授理科", "2017");*/

        //crawerFirst.paChongResult();

        crawerFirst.paChongGongAn("https://www.nm.zsks.cn/19gkwb/201907/t20190705_38482.html", "2019");
    }

}
