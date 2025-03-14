package com.atguigu.lease.schedule;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class ScheduleTasksTest {


    @Autowired
    private ScheduleTasks tasks;

    @Test
    public  void  test(){
        tasks.checkLeaseStatus();

    }

    @Test
    public void testMd5(){
        System.out.println(DigestUtils.md5("测试赛"));
        System.out.println(DigestUtils.md5Hex("测试赛"));
    }

}