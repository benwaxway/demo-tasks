package fr.uga.im2ag.l3.miage.tasks.data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Task {

    private Integer id;

    private String title;

    private List<String> tags;

    private Priority priority;

    private int order;

    private LocalDateTime creation;

    private LocalDateTime lastUpdate;

    private boolean active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.title) && Objects.equals(tags, task.tags) && priority == task.priority && Objects.equals(order, task.order) && Objects.equals(creation, task.creation) && Objects.equals(lastUpdate, task.lastUpdate) && Objects.equals(active, task.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, tags, priority, order, creation, lastUpdate, active);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", tags=" + tags +
                ", priority=" + priority +
                ", order=" + order +
                ", creation=" + creation +
                ", lastUpdate=" + lastUpdate +
                ", active=" + active +
                '}';
    }
}

