package yesithv.repositories;

import yesithv.entities.PersonaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataExtractorRepository extends CrudRepository<PersonaEntity, Integer> {
}
