package com.spring.schedule.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chencai
 * @ClassName: ScheduledTasks
 * @ProjectName spring-schedule
 * @Description:
 * @date 2019/3/18 10:48
 * @Email cai.chen@fujfu.com
 */

@Component
public class ScheduledTimerTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTimerTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(cron = "*/3 * * * * *"/*fixedRate = 1000*/)
//    public void reportCurrentTime() {
//        log.info("The time is now {}", dateFormat.format(new Date()));
//    }



}
