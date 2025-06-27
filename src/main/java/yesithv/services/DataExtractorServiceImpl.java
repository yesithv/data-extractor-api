package yesithv.services;

import yesithv.entities.PersonaEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yesithv.repositories.DataExtractorRepository;

import java.util.List;


@Slf4j
@Service
@AllArgsConstructor
public class DataExtractorServiceImpl implements DataExtractorService {

    private final DataExtractorRepository dataExtractorRepository;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<PersonaEntity> getPersonaInformation(Integer idPersona) {
        log.info("Searching person by id: {}", idPersona);
        return dataExtractorRepository.findById(idPersona)
                .map(persona -> {
                    int atencionesCount = persona.getAtenciones() != null ? persona.getAtenciones().size() : 0;
                    log.info("Found {} atenciones for personId {}", atencionesCount, idPersona);
                    return ResponseEntity.ok(persona);
                })
                .orElseGet(() -> {
                    log.info("Person not found for id: {}", idPersona);
                    return ResponseEntity
                            .status(HttpStatus.NOT_FOUND)
                            .body(null);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonaEntity> getAllPersons() {
        return List.of();
    }
}
