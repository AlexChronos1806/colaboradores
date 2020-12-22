package br.com.sulamerica.colaboradores.service.impl;

import br.com.sulamerica.colaboradores.config.exception.ColaboradorException;
import br.com.sulamerica.colaboradores.dto.SetorResponseDTO;
import br.com.sulamerica.colaboradores.entity.Setor;
import br.com.sulamerica.colaboradores.repository.SetorRepository;
import br.com.sulamerica.colaboradores.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SetorServiceImpl implements SetorService {

    @Autowired
    private SetorRepository repository;

    @Override
    public Setor buscarPor(String descricao) {
        return repository.findByDescricao(descricao)
                .orElseThrow(() -> new ColaboradorException(MessageFormat.format("Setor {0} não encontrado.", descricao)));
    }

    @Override
    public List<SetorResponseDTO> buscarTodos() {
        List<Setor> setores = repository.findAll();
        List<SetorResponseDTO> lista = setores.stream()
                .map(SetorResponseDTO::new)
                .collect(Collectors.toList());
        return lista;
    }
}
