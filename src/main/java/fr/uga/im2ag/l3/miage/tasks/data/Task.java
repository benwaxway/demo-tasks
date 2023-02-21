package fr.uga.im2ag.l3.miage.tasks.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task {

       private Integer id;

       private String title;


       private LocalDateTime creation;

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

       public LocalDateTime getCreation() {
              return creation;
       }

       public void setCreation(LocalDateTime creation) {
              this.creation = creation;
       }


       @Override
       public boolean equals(Object o) {
              if (this == o) return true;
              if (o == null || getClass() != o.getClass()) return false;
              Task task = (Task) o;
              return Objects.equals(id, task.id) && Objects.equals(title, task.title)  && Objects.equals(creation, task.creation);
       }

       @Override
       public int hashCode() {
              return Objects.hash(id, title, creation);
       }

       @Override
       public String toString() {
              return "Task{" +
                      "id=" + id +
                      ", title='" + title + '\'' +
                      ", creation=" + creation +
                      '}';
       }
}

