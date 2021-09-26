package com.demo.consumer.service;

import com.demo.consumer.repository.TaskRepository;
import com.demo.model.Task;
import com.demo.model.TaskStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerService {

    @Autowired
    TaskRepository taskRepository;

    @KafkaListener(topics = "task", containerFactory = "kafkaListenerContainerFactory")
    public void processTasks(@Payload Task task) {
        task.setStatus(TaskStatus.RUNNING);
        System.out.println("Received Message with task id: " + task.getId());
        taskRepository.insert(task);
    }

    public List<Task> getRunningTasks() {
        return taskRepository.getRunningTasks();
    }

}
