package fr.uga.im2ag.l3.miage.tasks.data;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    private final EntityManager entityManager;

    @Autowired
    public TaskRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Task save(Task task) {
        entityManager.persist(task);
        return task;
    }

    public List<Task> loadAll() {
        return entityManager.createQuery("from Task", Task.class).getResultList();
    }
}
