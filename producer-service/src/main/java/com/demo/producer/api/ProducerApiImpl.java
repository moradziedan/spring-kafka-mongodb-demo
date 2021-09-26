package com.demo.producer.api;

import com.demo.model.Task;
import com.demo.producer.service.TaskProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerApiImpl implements ProducerApi {

    private final TaskProducerService taskProducerService;

    ProducerApiImpl(TaskProducerService taskProducerService) {
        this.taskProducerService = taskProducerService;
    }

    @Override
    @PostMapping("/task/submit")
    public String submit(@RequestBody Task task) {
        return taskProducerService.processTask(task);
    }
}
