package com.example.ToDo.business.concretes;

import com.example.ToDo.business.abstracts.TaskService;
import com.example.ToDo.business.requests.TaskRequest;
import com.example.ToDo.business.responses.TaskResponse;
import com.example.ToDo.core.ModelMapperService;
import com.example.ToDo.entity.Task;
import com.example.ToDo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskManager implements TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private ModelMapperService modelMapperService;
    @Override
    public void addTask(TaskRequest taskrequest) {

        Task task = this.modelMapperService.forRequest()
                .map(taskrequest,Task.class);
        this.taskRepository.save(task);


    }

    @Override
    public void updateTask(TaskRequest taskrequest) {
        Task task = this.modelMapperService.forRequest()
                .map(taskrequest,Task.class);
        this.taskRepository.save(task);
    }

    @Override
    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<TaskResponse> getTasks() {
        List<Task> tasks = taskRepository.findAll();

        List<TaskResponse> responseList = tasks.stream()
                .map(task -> this.modelMapperService.forResponse()
                        .map(task,TaskResponse.class)).collect(Collectors.toList());

        return responseList;
    }
    @Override
    public boolean controlTask(TaskRequest taskRequest){

        if (taskRequest.getTitle().isEmpty()){
            return true;
        } else if (taskRequest.getTitle().isEmpty()) {
            return true;
        } else if (taskRequest.getStartDate().isEmpty()) {
            return true;
        }else if(taskRequest.getDeadLine().isEmpty()){
            return true;
        }else {
            return false;
        }


    }

}
