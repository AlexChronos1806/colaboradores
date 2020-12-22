package br.com.sulamerica.colaboradores.service;

import br.com.sulamerica.colaboradores.dto.SetorResponseDTO;
import br.com.sulamerica.colaboradores.entity.Setor;

import java.util.List;

public interface SetorService {

    Setor buscarPor(String descricao);

    List<SetorResponseDTO> buscarTodos();
}
