package br.com.sulamerica.colaboradores.resource;

import br.com.sulamerica.colaboradores.dto.SetorResponseDTO;
import br.com.sulamerica.colaboradores.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/setores")
public class SetorResource {

    @Autowired
    private SetorService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SetorResponseDTO> buscarTodos() {
        return service.buscarTodos();
    }
}
