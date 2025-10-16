package ir.msob.manak.process.task;

import ir.msob.jima.process.ral.activiti.beans.query.TaskQueryBuilder;
import ir.msob.manak.domain.process.repository.BaseTaskRepository;
import org.activiti.engine.TaskService;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository extends BaseTaskRepository {

    public TaskRepository(TaskService taskService, TaskQueryBuilder queryBuilder) {
        super(taskService, queryBuilder);
    }
}

