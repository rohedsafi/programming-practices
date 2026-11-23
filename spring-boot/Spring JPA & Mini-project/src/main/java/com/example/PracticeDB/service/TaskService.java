package com.example.PracticeDB.service;

import com.example.PracticeDB.model.Tasks;
import com.example.PracticeDB.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepo taskRepo;
    @Autowired
    TaskService(TaskRepo taskRepo){
        this.taskRepo = taskRepo;
    }

    public List<Tasks> printTask() {
        return taskRepo.findAll();
    }

//    public void addTask(Tasks tasks){
//      taskRepo.save(tasks);
//    }
    public Tasks addTask(Tasks detail){
        return taskRepo.save(detail);
    }

    public boolean deleteTask(int id){
        return taskRepo.findById(id).map(user -> {
            taskRepo.delete(user);
            return true;
        }).orElse(false);

    }

    public Optional<Tasks> updateTask(int id, Tasks detail) {
    //    return taskRepo.updateTitleById(id,detail); // simple way
        return taskRepo.findById(id).map(existUser -> {
            existUser.setTaskTitle(detail.getTaskTitle());
            return taskRepo.save(existUser);
        });
//        Tasks exit = taskRepo.findById(id)
//                .orElseThrow(() -> new UserPrincipalNotFoundException("User not found with id:" + id));
//
//        exit.setTaskTitle(detail.getTaskTitle());
//        return taskRepo.save(exit);
    }
}
