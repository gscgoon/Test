package com.scheduled.demo.scheduled;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//多线程开启定时任务
@Component
//@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling //开启定时任务
@EnableAsync //开启多线程
public class MultithreadScheduleTask {

    @Async
    @Scheduled(fixedDelay = 1000)//间隔1秒
    public  void first() throws InterruptedException {
        System.out.println("第一个定时任务开始：" + LocalDateTime.now().toLocalTime() + "\r\n线程:"+Thread.currentThread().getName());
        System.out.println();
        Thread.sleep(1000 * 10);
    }

    @Async
    @Scheduled(fixedDelay = 2000)
    public void second(){
        System.out.println("第二个定时任务开始：" + LocalDateTime.now().toLocalTime()+ "\r\n线程:" + Thread.currentThread().getName());
        System.out.println();

    }

}
