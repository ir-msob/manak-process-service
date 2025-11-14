package ir.msob.manak.process.process;

import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.domain.model.process.process.Process;
import ir.msob.manak.domain.model.process.process.ProcessDto;
import ir.msob.manak.domain.process.service.BaseProcessService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProcessService extends BaseProcessService<ProcessRepository> {

    private final ModelMapper modelMapper;

    @Override
    public ProcessDto toDto(Process process, User user) {
        return modelMapper.map(process, ProcessDto.class);
    }

    @Override
    public Process toDomain(ProcessDto dto, User user) {
        return modelMapper.map(dto, Process.class);
    }
}
