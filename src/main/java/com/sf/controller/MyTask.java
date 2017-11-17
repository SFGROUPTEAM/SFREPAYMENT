package com.sf.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Date;

/**
 * Created by lijianguo on 2017/11/14.
 */
@Component
public class MyTask {
    @Scheduled(cron="0/5 * * * * ? ") //间隔5秒执行
    public void taskCycle(){
        System.out.println("cron"+ new Date());
    }
}
