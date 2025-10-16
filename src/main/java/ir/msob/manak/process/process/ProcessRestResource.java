package ir.msob.manak.process.process;

import ir.msob.jima.core.commons.resource.Resource;
import ir.msob.jima.core.commons.shared.ResourceType;
import ir.msob.manak.domain.model.process.process.Process;
import ir.msob.manak.domain.process.restful.service.BaseProcessRestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ProcessRestResource.BASE_URI)
@Resource(value = Process.DOMAIN_NAME_WITH_HYPHEN, type = ResourceType.RESTFUL)
public class ProcessRestResource extends BaseProcessRestResource<ProcessRepository, ProcessService> {
    public static final String BASE_URI = "/api/v1/" + Process.DOMAIN_NAME_WITH_HYPHEN;

}
