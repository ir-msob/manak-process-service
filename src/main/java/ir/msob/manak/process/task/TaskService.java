package ir.msob.manak.process.task;

import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.domain.model.process.task.Task;
import ir.msob.manak.domain.model.process.task.TaskDto;
import ir.msob.manak.domain.process.service.BaseTaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskService extends BaseTaskService<TaskRepository> {

    @Override
    public TaskDto toDto(Task process, User user) {
        return null;
    }

    @Override
    public Task toDomain(TaskDto dto, User user) {
        return null;
    }
}
