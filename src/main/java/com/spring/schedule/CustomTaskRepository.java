package com.spring.schedule;

import org.springframework.cloud.task.repository.TaskRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomTaskRepository extends TaskRepository {

}
