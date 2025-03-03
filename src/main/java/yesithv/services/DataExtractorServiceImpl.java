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
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body(null));
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonaEntity> getAllPersons() {
        return List.of();
    }
}
