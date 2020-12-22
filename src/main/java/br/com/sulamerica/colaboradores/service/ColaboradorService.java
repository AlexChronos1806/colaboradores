package br.com.sulamerica.colaboradores.service;

import br.com.sulamerica.colaboradores.dto.ColaboradorRequestDTO;
import br.com.sulamerica.colaboradores.dto.ColaboradorResponseDTO;
import br.com.sulamerica.colaboradores.entity.Colaborador;

public interface ColaboradorService {

    Colaborador salvar(ColaboradorRequestDTO dto);

    ColaboradorResponseDTO buscar(Long id);

    void remover(Long id);
}
