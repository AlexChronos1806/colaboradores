package br.com.sulamerica.colaboradores.repository;

import br.com.sulamerica.colaboradores.entity.Setor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SetorRepository extends JpaRepository<Setor, Long> {

    Optional<Setor> findByDescricao(String descricao);
}
