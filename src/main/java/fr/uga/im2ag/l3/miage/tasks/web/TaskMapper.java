package fr.uga.im2ag.l3.miage.tasks.web;

import fr.uga.im2ag.l3.miage.tasks.data.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDTO entityToDTO(Task task);

    Task dtoToEntity(TaskDTO dto);

    List<TaskDTO> entityToDTO(List<Task> tasks);

}