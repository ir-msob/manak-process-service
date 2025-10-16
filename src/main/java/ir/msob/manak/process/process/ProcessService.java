package ir.msob.manak.process.process;

import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.domain.model.process.process.Process;
import ir.msob.manak.domain.model.process.process.ProcessDto;
import ir.msob.manak.domain.process.service.BaseProcessService;
import org.springframework.stereotype.Service;

@Service
public class ProcessService extends BaseProcessService<ProcessRepository> {


    @Override
    public ProcessDto toDto(Process process, User user) {
        return null;
    }

    @Override
    public Process toDomain(ProcessDto dto, User user) {
        return null;
    }
}
