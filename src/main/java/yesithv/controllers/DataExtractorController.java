package yesithv.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
@RequestMapping("/data-extractor-api/v1/")
public class DataExtractorController {

    private final DataExtractorService dataExtractorService;

    @Operation(summary = "Obtiene la informacion de la persona por idPersona")
    @ApiResponse(responseCode = "200", description = "Persona encontrada")
    @GetMapping("/persona/{idPerson}")
    public ResponseEntity<PersonaEntity> show(@Parameter(description = "Id de la persona") @PathVariable Integer idPerson) {
        log.info("Receivded request for id: {}", idPerson);
        return dataExtractorService.getPersonaInformation(idPerson);
    }
}
