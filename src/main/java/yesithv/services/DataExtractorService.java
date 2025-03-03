package yesithv.services;

import yesithv.entities.PersonaEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DataExtractorService {

    ResponseEntity<PersonaEntity> getPersonaInformation(Integer idPersona);

    List<PersonaEntity> getAllPersons();
}
