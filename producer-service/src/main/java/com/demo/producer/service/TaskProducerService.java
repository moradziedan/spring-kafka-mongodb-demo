package com.demo.producer.service;

import com.demo.model.Task;
import com.demo.model.TaskStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class TaskProducerService {

    @Value("${demo.kafka.topic-name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, Task> kafkaTemplate;

    public String processTask(Task task){
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        task.setId(id);
        task.setStatus(TaskStatus.PENDING);
        task.setCreationTime(new Date());
        //send task
        kafkaTemplate.send(topicName, task);
        return id;
    }

}
