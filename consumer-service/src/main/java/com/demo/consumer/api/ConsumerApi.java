package com.demo.consumer.api;

import com.demo.model.Task;

import java.util.List;

public interface ConsumerApi {

    List<Task> getActiveTasks();
}
