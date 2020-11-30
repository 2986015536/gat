package com.qf.quartz;


import org.quartz.*;
import org.quartz.impl.StdJobRunShellFactory;
import org.quartz.impl.StdSchedulerFactory;

import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) throws SchedulerException {
        //获取任务调度器
        Scheduler defaultScheduler = StdSchedulerFactory.getDefaultScheduler();
        //任务详情
        JobDetail build = JobBuilder.newJob(MyJob.class).withIdentity("myjob", "mygroup").build();
        SimpleTrigger build1 = TriggerBuilder.newTrigger().withIdentity("simpleTrigger", "mygroup")
                .startNow()
                .withSchedule(SimpleScheduleBuilder
                        .simpleSchedule()
                        .withIntervalInSeconds(2)
                        .repeatForever()
//                        .withRepeatCount(5)
                        )
                .endAt(new GregorianCalendar(2020,10,25,19,34).getTime())
                .build();

        defaultScheduler.scheduleJob(build,build1);
        defaultScheduler.start();
    }
}
