package com.example.ToDo.controller;

import com.example.ToDo.business.abstracts.TaskService;
import com.example.ToDo.business.responses.TaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    public ResponseEntity<String> delete(@PathVariable int id){
        if(id == 0){
            return new ResponseEntity<>("Wrong id number", HttpStatus.BAD_REQUEST);
        }
        taskService.deleteTask(id);
        return new ResponseEntity<>("deleted",HttpStatus.OK);
    }

}
