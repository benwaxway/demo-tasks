package fr.uga.im2ag.l3.miage.tasks.web;

import fr.uga.im2ag.l3.miage.tasks.data.Priority;
import fr.uga.im2ag.l3.miage.tasks.data.Task;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {


    TaskDTO entityToDTO(Task task);

    @Mappings(
            @Mapping(target = "active", expression = "java(dto.active() == null ? true: dto.active())")
    )
    Task dtoToEntity(TaskDTO dto);

    List<TaskDTO> entityToDTO(List<Task> tasks);

    @EnumMapping(nameTransformationStrategy = "case", configuration = "lower")
    String enumToString(Priority priority);

    @InheritInverseConfiguration
    @ValueMapping(source = MappingConstants.NULL, target = "MEDIUM")
    @ValueMapping(source = "", target = "MEDIUM")
    Priority stringToEnum(String priority);

}