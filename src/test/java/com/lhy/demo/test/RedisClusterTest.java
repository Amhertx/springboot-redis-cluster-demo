package com.lhy.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisClusterTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test(){
        System.out.println("进行存储");
        redisTemplate.opsForValue().set("student_name","lll");
        System.out.println("拿到的键值"+redisTemplate.opsForValue().get("student_name"));
    }
}
