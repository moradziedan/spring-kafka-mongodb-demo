package com.demo.consumer.repository;

import com.demo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {

    @Query("{status:'RUNNING'}")
    List<Task> getRunningTasks();
}
