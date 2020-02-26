package com.scheduled.demo.scheduled;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//添加定时任务
@Component
@Configuration
@EnableScheduling
public class SaticScheduleTask {

    /**
     * Cron表达式参数分别表示：
     *
     * 秒（0~59） 例如0/5表示每5秒
     * 分（0~59）
     * 时（0~23）
     * 日（0~31）的某天，需计算
     * 月（0~11）
     * 周几（ 可填1-7 或 SUN/MON/TUE/WED/THU/FRI/SAT）
     * @Scheduled：除了支持灵活的参数表达式cron之外，还支持简单的延时操作，例如 fixedDelay ，fixedRate 填写相应的毫秒数即可。
     */

    //添加定时任务
    @Scheduled(cron= "0/5 * * * * ?")
    private  void configreTasks(){
        System.out.println("执行静态的定时任务的时间：" + LocalDateTime.now());
    }
}
