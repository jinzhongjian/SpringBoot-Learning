package com.rodney.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//上一次开始执行时间点之后5秒再执行
    public void reportCurrentTimea(){
        System.out.println("现在时间："+sdf.format(new Date()));
    }

    @Scheduled(fixedDelay = 5000)//上一次执行完毕时间点之后5秒再执行
    public void reportCurrentTimea2(){
        System.out.println("现在时间2："+sdf.format(new Date()));
    }

    @Scheduled(initialDelay=1000, fixedRate=5000)//第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
    public void reportCurrentTimea3(){
        System.out.println("现在时间3："+sdf.format(new Date()));
    }

    @Scheduled(cron = "*/5 * * * * *")//通过cron表达式定义规则
    public void reportCurrentTimea4(){
        System.out.println("现在时间："+sdf.format(new Date()));
    }

}
