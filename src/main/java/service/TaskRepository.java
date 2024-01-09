package service;

import model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

// TaskRepository.java
public interface TaskRepository extends JpaRepository<Task, Long> {
}
