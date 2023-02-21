package fr.uga.im2ag.l3.miage.tasks.data;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public class TaskRepository {


    public Task save(Task task) {
        return task;
    }

    public List<Task> loadAll() {
        return null;
    }
}
