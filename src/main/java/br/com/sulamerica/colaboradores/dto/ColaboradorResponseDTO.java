package br.com.sulamerica.colaboradores.dto;

import br.com.sulamerica.colaboradores.entity.Colaborador;

public class ColaboradorResponseDTO {

    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private SetorDTO setor;

    public ColaboradorResponseDTO(Colaborador colaborador) {
        this.setId(colaborador.getId());
        this.setNome(colaborador.getNome());
        this.setCpf(colaborador.getCpf());
        this.setTelefone(colaborador.getTelefone());
        this.setEmail(colaborador.getEmail());
        this.setor = new SetorDTO(colaborador.getSetor());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SetorDTO getSetor() {
        return setor;
    }

    public void setSetor(SetorDTO setor) {
        this.setor = setor;
    }
}
