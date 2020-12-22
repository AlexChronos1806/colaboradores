package br.com.sulamerica.colaboradores.dto;

import br.com.sulamerica.colaboradores.entity.Setor;

public class SetorDTO {

    private Long id;
    private String descricao;

    public SetorDTO(Setor setor) {
        this.id = setor.getId();
        this.descricao = setor.getDescricao();
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
}
