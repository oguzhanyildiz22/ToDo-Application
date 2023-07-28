package com.example.ToDo.business.abstracts;

import com.example.ToDo.business.responses.TaskResponse;
import com.example.ToDo.business.requests.TaskRequest;

import java.util.List;


public interface TaskService {

    void addTask(TaskRequest taskrequest);

    void updateTask(TaskRequest taskrequest);

    void deleteTask(int id);

    List<TaskResponse> getTasks();


}
