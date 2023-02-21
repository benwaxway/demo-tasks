package fr.uga.im2ag.l3.miage.tasks.web;

import fr.uga.im2ag.l3.miage.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskController {

    private final TaskMapper taskMapper;
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskMapper taskMapper, TaskService taskService) {
        this.taskMapper = taskMapper;
        this.taskService = taskService;
    }

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public TaskDTO create(@RequestBody TaskDTO taskDTO) {
        var task = taskMapper.dtoToEntity(taskDTO);
        task = taskService.save(task);
        return taskMapper.entityToDTO(task);
    }

    @GetMapping("/tasks")
    public List<TaskDTO> all() {
        var tasks = taskService.getAll();
        return taskMapper.entityToDTO(tasks);
    }


}
