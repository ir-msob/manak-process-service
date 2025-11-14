package ir.msob.manak.process.task;

import ir.msob.jima.process.ral.camunda.beans.query.CamundaApiClient;
import ir.msob.jima.process.ral.camunda.beans.query.TaskQueryBuilder;
import ir.msob.manak.domain.process.repository.BaseTaskRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository extends BaseTaskRepository {

    public TaskRepository(CamundaApiClient camundaClient, TaskQueryBuilder queryBuilder) {
        super(camundaClient, queryBuilder);
    }
}

