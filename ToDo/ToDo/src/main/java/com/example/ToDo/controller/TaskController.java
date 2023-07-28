package com.example.ToDo.controller;

import com.example.ToDo.business.abstracts.TaskService;
import com.example.ToDo.business.responses.TaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/list")
    public List<TaskResponse> getAllTasks(){
       return taskService.getTasks();
    }

}
