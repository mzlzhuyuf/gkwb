package com.zyf.springboot06datamybatis.service;

import com.zyf.springboot06datamybatis.bean.Major;
import com.zyf.springboot06datamybatis.bean.School;
import com.zyf.springboot06datamybatis.bean.SchoolLocation;
import com.zyf.springboot06datamybatis.dao.MajorDao;
import com.zyf.springboot06datamybatis.dao.SchoolDao;
import com.zyf.springboot06datamybatis.dao.SchoolLocationDao;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hero
 * @description PACKAGE_NAME
 * @date 2019/6/24
 */
@Service
public class CrawerFirst {
    @Autowired
    SchoolDao schoolDao;

    @Autowired
    MajorDao majorDao;

    @Autowired
    SchoolLocationDao schoolLocationDao;
    public void paChong(String url, String subject) throws Exception {

        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建httpGet对象 获取访问地址
        HttpGet httpGet = new HttpGet(url);

        //使用httpClient对象发起请求 获取响应
        CloseableHttpResponse response = httpClient.execute(httpGet);

        //解析响应，获取数据
        //判断状态码是否是200
        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity httpEntity = response.getEntity();
            //拿到静态页面
            String content = EntityUtils.toString(httpEntity, "gbk");
            Document doc = Jsoup.parse(content);
            Element table = doc.getElementById("report1");
            Elements trs = table.select("tr");
            /*for (int i = 0; i < trs.size(); i++) {

            }*/

            for (int i = 3; i < trs.size() - 1; i++) {
                Element tempTr = trs.get(i);
                School school = new School();
                Elements tds = tempTr.select("td");
                school.setSubject(subject);
                school.setBatch(tds.get(2).text());
                school.setSchoolid(tds.get(3).text());
                school.setSchoolname(tds.get(4).text());
                school.setAmount(Integer.valueOf(tds.get(5).text()));
                school.setOnetoone(Integer.valueOf(tds.get(6).text()));
                school.setProportion(tds.get(7).text());
                school.setPredictscore(Integer.valueOf(tds.get(8).text()));
                school.setShouldamount(Integer.valueOf(tds.get(9).text()));
                school.setAlreadyamount(Integer.valueOf(tds.get(10).text()));
                if (tds.get(11).text() != null && tds.get(11).text().length() != 0) {
                    school.setLackamount(Integer.valueOf(tds.get(11).text()));
                }
                school.setSchoolhref("https://www.nm.zsks.cn" + tds.get(4).select("a").attr("href"));
                school.setRegulations(tds.get(12).select("a").attr("href"));
                school.setYear("2018");
                //System.out.println(school.toString());
                schoolDao.addSchool(school);
                paChongMajor(school);
            }


            /*BufferedWriter bufferedWriter = null;
            try {
                File file = new File("D:/gkwb/test.html");
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(content);
                *//*Document doc = Jsoup.parse(content);
                Element table = doc.getElementById("report1");
                Elements trs = table.select("tr");
                for (int i = 0; i < trs.size(); ++i) {
                    // 获取一个tr
                    Element tr = trs.get(i);
                    // 获取该行的所有td节点
                    Elements tds = tr.select("td");
                    // 选择某一个td节点
                    Element hrefs = tds.select("a").first();
                    if (hrefs != null) {
                        System.out.println(hrefs.attr("href"));
                    }
                }*//*
            } finally {
                bufferedWriter.close();
            }*/
            //System.out.println(content);
        }
    }

    public void paChongMajor(School school) throws Exception {
        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建httpGet对象 获取访问地址
        HttpGet httpGet = new HttpGet(school.getSchoolhref());

        //使用httpClient对象发起请求 获取响应
        CloseableHttpResponse response = httpClient.execute(httpGet);

        //解析响应，获取数据
        //判断状态码是否是200
        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity httpEntity = response.getEntity();
            //拿到静态页面
            String content = EntityUtils.toString(httpEntity, "gbk");
            Document doc = Jsoup.parse(content);
            Element table = doc.getElementById("report1");
            Elements trs = table.select("tr");
            /*for (int i = 0; i < trs.size(); i++) {

            }*/

            //System.out.println(major.toString());
            for (int i = 3; i < trs.size() - 2; i++) {
                Element tempTr = trs.get(i);
                Major major = new Major();
                Elements tds = tempTr.select("td");
                major.setSubject(school.getSubject());
                major.setBatch(school.getBatch());
                major.setSchoolId(school.getSchoolid());
                major.setSchoolName(school.getSchoolname());
                major.setMajorId(tds.get(0).text());
                major.setMajorName(tds.get(1).text());
                major.setAmount(Integer.valueOf(tds.get(2).text()));
                major.setOneOneScore(Integer.valueOf(tds.get(3).text()));
                major.setAlreadyAmount(Integer.valueOf(tds.get(4).text()));
                major.setTuitionFee(tds.get(5).text());
                major.setLocation(tds.get(6).text());
                if (tds.get(7).text().length() < 250){
                    major.setRemark(tds.get(7).text());
                } else {
                    major.setRemark("备注过长，请前往" + school.getSchoolhref() + "查看");
                }
                major.setYear(school.getYear());
                majorDao.insert(major);
            }
        }
    }

    public void paChongLocation(String url) throws Exception {
        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建httpGet对象 获取访问地址
        HttpGet httpGet = new HttpGet("https://gaokao.chsi.com.cn/gkxx/zcdh/201906/20190618/1799058286.html");

        //使用httpClient对象发起请求 获取响应
        CloseableHttpResponse response = httpClient.execute(httpGet);

        //解析响应，获取数据
        //判断状态码是否是200
        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity httpEntity = response.getEntity();
            //拿到静态页面
            String content = EntityUtils.toString(httpEntity, "gbk");
            Document doc = Jsoup.parse(content);
            Elements table = doc.getElementsByClass("content-l");
            System.out.println(table.text());
            Elements p = table.select("p");
            for (int i = 1; i < 2; i++) {
                Element a = p.get(i).selectFirst("a");
                System.out.println(a.attr("href"));
                String locationURL = "https://gaokao.chsi.com.cn" + a.attr("href");
                getCityByProvice(locationURL);
            }

        }

    }

    public void getCityByProvice (String url) throws Exception {
        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建httpGet对象 获取访问地址
        HttpGet httpGet = new HttpGet(url);

        //使用httpClient对象发起请求 获取响应
        CloseableHttpResponse response = httpClient.execute(httpGet);

        //解析响应，获取数据
        //判断状态码是否是200
        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity httpEntity = response.getEntity();
            //拿到静态页面
            String content = EntityUtils.toString(httpEntity, "gbk");
            Document doc = Jsoup.parse(content);
            Element table = doc.selectFirst("table");
            System.out.println(table.text());
            Elements trs = table.select("tr");
            Element province = trs.get(1).selectFirst("td");
            String provinceString = province.text().split("（")[0];

            for (int i = 2; i < trs.size(); i++) {
                SchoolLocation schoolLocation = new SchoolLocation();
                Elements tds = trs.get(i).select("td");
                schoolLocation.setSchoolName(tds.get(1).text());
                schoolLocation.setDepartment(tds.get(3).text());
                schoolLocation.setCity(tds.get(4).text());
                schoolLocation.setProvince(provinceString);
                schoolLocation.setBatch(tds.get(5).text());
                if (tds.get(6) != null ) {
                    schoolLocation.setRemark(tds.get(6).text());
                    if (tds.get(6).text().length() > 0)
                    schoolLocation.setSchoolName(tds.get(1).text() + "（" + tds.get(6).text() + "）");
                }
                schoolLocationDao.insert(schoolLocation);
            }

        }
    }
}
