package ch.uzh.seals.dockalyzerwebserver.repository;

import ch.uzh.ifi.seal.dockalyzer.models.Project;
import ch.uzh.seals.dockalyzerwebserver.domain.ProjectDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * DAO for {@link Project}s.
 */
@Repository
public interface ProjectRepository extends CrudRepository<ProjectDTO, Long> {


}
