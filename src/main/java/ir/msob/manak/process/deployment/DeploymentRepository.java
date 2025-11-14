package ir.msob.manak.process.deployment;

import ir.msob.jima.process.ral.camunda.beans.query.CamundaApiClient;
import ir.msob.jima.process.ral.camunda.beans.query.DeploymentQueryBuilder;
import ir.msob.manak.domain.process.repository.BaseDeploymentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DeploymentRepository extends BaseDeploymentRepository {

    public DeploymentRepository(CamundaApiClient camundaClient, DeploymentQueryBuilder queryBuilder) {
        super(camundaClient, queryBuilder);
    }
}

