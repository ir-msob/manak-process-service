package ir.msob.manak.process.process;

import ir.msob.jima.process.ral.camunda.beans.query.CamundaApiClient;
import ir.msob.jima.process.ral.camunda.beans.query.ProcessInstanceQueryBuilder;
import ir.msob.manak.domain.process.repository.BaseProcessRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProcessRepository extends BaseProcessRepository {

    public ProcessRepository(CamundaApiClient camundaClient, ProcessInstanceQueryBuilder queryBuilder) {
        super(camundaClient, queryBuilder);
    }
}