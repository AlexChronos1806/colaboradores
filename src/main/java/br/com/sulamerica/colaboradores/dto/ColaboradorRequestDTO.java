package br.com.sulamerica.colaboradores.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ColaboradorRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 2, max = 60, message = "O nome deve ter entre 3 e 60 caracteres.")
    private String nome;

    @NotBlank(message = "O CPF é obrigatório.")
    @Size(min = 11, max = 14, message = "O cpf deve ter entre 11 e 14 caracteres.")
    private String cpf;

    @NotBlank(message = "O telefone é obrigatório.")
    @Size(min = 9, max = 15, message = "O telefone deve ter entre 9 e 15 caracteres.")
    private String telefone;

    @Email(message = "O email é obrigatório.")
    @Size(min = 6, max = 40, message = "O email deve ter entre 6 e 40 caracteres.")
    private String email;

    @NotBlank(message = "O setor é obrigatório.")
    private String setor;

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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
