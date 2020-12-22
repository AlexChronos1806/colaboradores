package br.com.sulamerica.colaboradores.dto;

import br.com.sulamerica.colaboradores.entity.Setor;

import java.util.List;
import java.util.stream.Collectors;

public class SetorResponseDTO {

    private Long id;
    private String descricao;
    private List<ColaboradorPorSetorDTO> colaboradores;

    public SetorResponseDTO(Setor setor) {
        this.id = setor.getId();
        this.descricao = setor.getDescricao();
        this.colaboradores = setor.getColaboradores().stream()
                .map(ColaboradorPorSetorDTO::new)
                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ColaboradorPorSetorDTO> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<ColaboradorPorSetorDTO> colaboradores) {
        this.colaboradores = colaboradores;
    }
}
