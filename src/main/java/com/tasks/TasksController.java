package com.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TasksController {

    private final TasksConfig config;

    @Autowired
    public TasksController(TasksConfig config) {
        this.config = config;
    }

    @GetMapping(path = "/")
    public String tasks() {
        return config.getEndpointMessage();
    }
}
