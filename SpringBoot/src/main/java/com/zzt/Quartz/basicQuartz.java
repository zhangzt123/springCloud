package com.zzt.Quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时类测试
 */
//@Component
public class basicQuartz {

    @Scheduled(cron = "0/1 * * * * ?")
    public void testQuartz()
    {
        System.out.println("1");
    }

}
