package cl.rvillablanca.flying.saucer.controller;

import cl.rvillablanca.flying.saucer.service.FSException;
import cl.rvillablanca.flying.saucer.service.FlyingSaucerService;
import cl.rvillablanca.flying.saucer.service.HTMLInput;
import cl.rvillablanca.flying.saucer.service.PDFResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rodrigo Villablanca
 */
@RestController
public class FlyingSaucerController {

    FlyingSaucerService service;

    public FlyingSaucerController(FlyingSaucerService service) {
        this.service = service;
    }

    @PostMapping(value = "/convert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<PDFResponse> convertToPDF(@RequestBody HTMLInput input) throws FSException {
        if (input == null || input.getValue() == null || input.getValue().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(service.toPdf(input), HttpStatus.OK);
    }
}
