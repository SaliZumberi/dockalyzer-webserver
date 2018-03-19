package ch.uzh.seals.dockalyzerwebserver.service.impl;

import ch.uzh.ifi.seal.dockalyzer.models.Project;
import ch.uzh.seals.dockalyzerwebserver.domain.ProjectDTO;
import ch.uzh.seals.dockalyzerwebserver.repository.ProjectRepository;
import ch.uzh.seals.dockalyzerwebserver.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl extends GenericServiceImpl<ProjectDTO, Long> implements ProjectService {

    private ProjectRepository projectRepository;

    public ProjectServiceImpl() {}

    @Autowired
    public ProjectServiceImpl(@Qualifier("projectRepository") CrudRepository<ProjectDTO, Long> crudRepository) {
        super(crudRepository);
        this.projectRepository = (ProjectRepository) crudRepository;
    }

    // implement special methods once defined in UserService

}