package ir.msob.manak.process.task;

import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.domain.model.process.task.Task;
import ir.msob.manak.domain.model.process.task.TaskDto;
import ir.msob.manak.domain.process.service.BaseTaskService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService extends BaseTaskService<TaskRepository> {

    private final ModelMapper modelMapper;

    @Override
    public TaskDto toDto(Task process, User user) {
        return modelMapper.map(process, TaskDto.class);
    }

    @Override
    public Task toDomain(TaskDto dto, User user) {
        return modelMapper.map(dto, Task.class);
    }
}
