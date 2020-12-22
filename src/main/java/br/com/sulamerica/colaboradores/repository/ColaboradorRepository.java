package br.com.sulamerica.colaboradores.repository;

import br.com.sulamerica.colaboradores.entity.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
}
