package fr.uga.im2ag.l3.miage.tasks.service;

import fr.uga.im2ag.l3.miage.tasks.data.Task;
import fr.uga.im2ag.l3.miage.tasks.data.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    @Autowired
    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Task save(Task task) {
        return repository.save(task);
    }

    public List<Task> getAll() {
        return repository.loadAll();

    }
}
