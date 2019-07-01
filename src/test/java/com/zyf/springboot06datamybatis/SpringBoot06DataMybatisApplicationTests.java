package com.zyf.springboot06datamybatis;

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

        crawerFirst.paChongResult();
    }

}
