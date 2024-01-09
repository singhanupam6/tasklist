package controller;

import model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/get")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        // Implement delete logic
        return ResponseEntity.ok().build();
    }
}
