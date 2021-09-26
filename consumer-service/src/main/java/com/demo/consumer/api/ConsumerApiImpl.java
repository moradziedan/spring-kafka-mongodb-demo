package com.demo.consumer.api;

import com.demo.consumer.service.ConsumerService;
import com.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerApiImpl implements ConsumerApi {

    @Autowired
    private ConsumerService consumerService;

    @Override
    @GetMapping("/task/active")
    public List<Task> getActiveTasks() {
        return consumerService.getRunningTasks();
    }
}
