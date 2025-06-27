package yesithv.controllers;

import yesithv.entities.PersonaEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yesithv.services.DataExtractorService;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/data-extractor-api/v1")
public class DataExtractorController {

    private final DataExtractorService dataExtractorService;

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/{idPerson}")
    public ResponseEntity<PersonaEntity> show(@PathVariable Integer idPerson) {
        log.info("Received request for id: {}", idPerson);
        return dataExtractorService.getPersonaInformation(idPerson);
    }
}
