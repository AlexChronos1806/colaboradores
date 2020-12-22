package br.com.sulamerica.colaboradores.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "setores")
public class Setor implements Serializable {

    private static final long serialVersionUID = -8353038957006385676L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @OneToMany(mappedBy = "setor", cascade = CascadeType.ALL)
    private Set<Colaborador> colaboradores;

    public Setor() {
    }

    public Setor(String descricao) {
        this.descricao = descricao;
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

    public Set<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(Set<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }
}
