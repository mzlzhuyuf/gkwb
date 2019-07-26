package com.zyf.springboot06datamybatis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author Hero
 * @description com.zyf.springboot06datamybatis
 * @date 2019/7/4
 */
public class JedisTest {
    @Test
    public void jedis() {
        Jedis jedis = new Jedis("47.95.212.214");
        jedis.auth("zhuyufRedis");
        jedis.set("jedis", "true");
        System.out.println(jedis.get("jedis"));
        System.out.println(jedis.get("name"));
        System.out.println(jedis.ping());
        jedis.close();
    }
}
