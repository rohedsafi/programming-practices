package com.example.PracticeDB.controller;

import com.example.PracticeDB.model.Tasks;
import com.example.PracticeDB.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Tasks> printTask(){
        return taskService.printTask();
    }

    @PostMapping
    public ResponseEntity<Tasks> addAllTasks(@RequestBody Tasks detail){
       // taskService.addTask(tasks); // simple way
        Tasks saved = taskService.addTask(detail);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saved.getTaskId())
                .toUri();

        return ResponseEntity.created(location).body(saved);

    }



//    @DeleteMapping("/{id}")
//    public void deleteTask(@PathVariable int id){
//        taskService.deleteTask(id);
//    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable int id) {
        boolean deleted = taskService.deleteTask(id);

        if (deleted) {
            return ResponseEntity.noContent().build();        // 204 No Content
        } else {
            return ResponseEntity.notFound().build();         // 404
        }
    }

 //   @RequestParam("title") String taskTitle // previse
    @PutMapping("/{id}")
    public ResponseEntity<Tasks> updateTask(@PathVariable int id ,@RequestBody Tasks detail){
        return taskService.updateTask(id , detail)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
