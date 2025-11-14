package ir.msob.manak.process.deployment;

import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.domain.model.process.deployment.Deployment;
import ir.msob.manak.domain.model.process.deployment.DeploymentDto;
import ir.msob.manak.domain.process.service.BaseDeploymentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeploymentService extends BaseDeploymentService<DeploymentRepository> {

    private final ModelMapper modelMapper;

    @Override
    public DeploymentDto toDto(Deployment process, User user) {
        return modelMapper.map(process, DeploymentDto.class);
    }

    @Override
    public Deployment toDomain(DeploymentDto dto, User user) {
        return modelMapper.map(dto, Deployment.class);
    }
}
