package br.com.sulamerica.colaboradores.resource;

import br.com.sulamerica.colaboradores.dto.ColaboradorRequestDTO;
import br.com.sulamerica.colaboradores.dto.ColaboradorResponseDTO;
import br.com.sulamerica.colaboradores.entity.Colaborador;
import br.com.sulamerica.colaboradores.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/api/v1/colaboradores")
public class ColaboradorResource {

    @Autowired
    private ColaboradorService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> salvar(@RequestBody @Valid ColaboradorRequestDTO dto) {
        Colaborador colaborador = service.salvar(dto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(colaborador.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ColaboradorResponseDTO buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping(path = "/{id}")
    public void remover(@PathVariable Long id) {
        service.remover(id);
    }
}
