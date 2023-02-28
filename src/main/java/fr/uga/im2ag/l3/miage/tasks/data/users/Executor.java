package fr.uga.im2ag.l3.miage.tasks.data.users;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Executor extends User {

    private int maxParallelTasks;
    private float maxExecutionTimeHours;

    public int getMaxParallelTasks() {
        return maxParallelTasks;
    }

    public void setMaxParallelTasks(int maxParallelTasks) {
        this.maxParallelTasks = maxParallelTasks;
    }

    public float getMaxExecutionTimeHours() {
        return maxExecutionTimeHours;
    }

    public void setMaxExecutionTimeHours(float maxExecutionTimeHours) {
        this.maxExecutionTimeHours = maxExecutionTimeHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Executor executor = (Executor) o;
        return maxParallelTasks == executor.maxParallelTasks && Float.compare(executor.maxExecutionTimeHours, maxExecutionTimeHours) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxParallelTasks, maxExecutionTimeHours);
    }
}
