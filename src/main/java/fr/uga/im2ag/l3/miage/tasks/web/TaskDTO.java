package fr.uga.im2ag.l3.miage.tasks.web;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public record TaskDTO(
        Integer id,
        @NotBlank
        String title,
        String[] tags,
        String priority,
        int order,
        Boolean active,
        @Null
        Date creation,
        @Null
        Date lastUpdate
) {

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                TaskDTO taskDTO = (TaskDTO) o;
                return order == taskDTO.order && Objects.equals(id, taskDTO.id) && title.equals(taskDTO.title) && Arrays.equals(tags, taskDTO.tags) && priority.equals(taskDTO.priority) && Objects.equals(creation, taskDTO.creation) && Objects.equals(lastUpdate, taskDTO.lastUpdate) && Objects.equals(active, taskDTO.active);
        }

        @Override
        public int hashCode() {
                int result = Objects.hash(id, title, priority, order, creation, lastUpdate, active);
                result = 31 * result + Arrays.hashCode(tags);
                return result;
        }

        @Override
        public String toString() {
                return "TaskDTO{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", tags=" + Arrays.toString(tags) +
                        ", priority='" + priority + '\'' +
                        ", order=" + order +
                        ", creation=" + creation +
                        ", lastUpdate=" + lastUpdate +
                        ", active=" + active +
                        '}';
        }
}
