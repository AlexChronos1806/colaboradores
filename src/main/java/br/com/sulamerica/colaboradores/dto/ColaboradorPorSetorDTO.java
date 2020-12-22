package br.com.sulamerica.colaboradores.dto;

import br.com.sulamerica.colaboradores.entity.Colaborador;

public class ColaboradorPorSetorDTO {

    private String nome;
    private String email;

    public ColaboradorPorSetorDTO(Colaborador colaborador) {
        this.nome = colaborador.getNome();
        this.email = colaborador.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
