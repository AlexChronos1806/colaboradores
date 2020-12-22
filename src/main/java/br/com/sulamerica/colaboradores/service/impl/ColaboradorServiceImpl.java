package br.com.sulamerica.colaboradores.service.impl;

import br.com.sulamerica.colaboradores.config.exception.ColaboradorException;
import br.com.sulamerica.colaboradores.dto.ColaboradorRequestDTO;
import br.com.sulamerica.colaboradores.dto.ColaboradorResponseDTO;
import br.com.sulamerica.colaboradores.entity.Colaborador;
import br.com.sulamerica.colaboradores.entity.Setor;
import br.com.sulamerica.colaboradores.repository.ColaboradorRepository;
import br.com.sulamerica.colaboradores.service.ColaboradorService;
import br.com.sulamerica.colaboradores.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.MessageFormat;

@Service
public class ColaboradorServiceImpl implements ColaboradorService {

    @Autowired
    private ColaboradorRepository repository;

    @Autowired
    private SetorService setorService;

    @Override
    @Transactional
    public Colaborador salvar(ColaboradorRequestDTO dto) {
        Setor setor = setorService.buscarPor(dto.getSetor());
        Colaborador colaborador = create(dto, setor);
        return repository.save(colaborador);
    }

    @Override
    public ColaboradorResponseDTO buscar(Long id) {
        Colaborador colaborador = buscarPor(id);
        return new ColaboradorResponseDTO(colaborador);
    }

    @Override
    @Transactional
    public void remover(Long id) {
        Colaborador colaborador = buscarPor(id);
        repository.delete(colaborador);
    }

    private Colaborador create(ColaboradorRequestDTO dto, Setor setor) {
        Colaborador colaborador = new Colaborador();
        colaborador.setNome(dto.getNome());
        colaborador.setCpf(dto.getCpf());
        colaborador.setEmail(dto.getEmail());
        colaborador.setTelefone(dto.getTelefone());
        colaborador.setSetor(setor);
        return colaborador;
    }

    private Colaborador buscarPor(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ColaboradorException(MessageFormat.format("Colaborador {0} não encontrado.", id)));
    }
}
