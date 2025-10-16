package ir.msob.manak.process.process;

import ir.msob.jima.process.ral.activiti.beans.query.ProcessInstanceQueryBuilder;
import ir.msob.manak.domain.process.repository.BaseProcessRepository;
import org.activiti.engine.RuntimeService;
import org.springframework.stereotype.Repository;

@Repository
public class ProcessRepository extends BaseProcessRepository {

    public ProcessRepository(RuntimeService runtimeService, ProcessInstanceQueryBuilder queryBuilder) {
        super(runtimeService, queryBuilder);
    }
}

