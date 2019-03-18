package com.spring.schedule.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.listener.annotation.FailedTask;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
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
public class ScheduledDependenceTasks implements TaskExecutionListener {

    private static final Logger log = LoggerFactory.getLogger(ScheduledDependenceTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void onTaskStartup(TaskExecution taskExecution) {
        log.info("ScheduledDependenceTasks.onTaskStartup:"+dateFormat.format(new Date()));
    }

    @Override
    public void onTaskEnd(TaskExecution taskExecution) {
        log.info("ScheduledDependenceTasks.onTaskEnd:"+dateFormat.format(new Date()));
        log.info("ScheduledDependenceTasks.taskExecution:"+taskExecution.getArguments().toArray().toString());
    }

    @Override
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {
        System.out.println("FailedTask");
    }
}
