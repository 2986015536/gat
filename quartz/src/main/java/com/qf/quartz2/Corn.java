package com.qf.quartz2;

import com.qf.quartz.MyJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class Corn {
    public static void main(String[] args) throws SchedulerException {
        Scheduler defaultScheduler = StdSchedulerFactory.getDefaultScheduler();
        CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger", "my")
                .withSchedule(
                        CronScheduleBuilder.cronSchedule("*/2 * * * * ?")
                )
                .build();
        JobDetail build = JobBuilder.newJob(MyJob.class).build();
        defaultScheduler.scheduleJob(build,trigger);
        defaultScheduler.start();
    }
}
