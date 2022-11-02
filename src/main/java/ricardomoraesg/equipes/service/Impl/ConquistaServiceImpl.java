package ricardomoraesg.equipes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardomoraesg.equipes.model.Conquista;
import ricardomoraesg.equipes.repository.ConquistaRepository;
import ricardomoraesg.equipes.service.ConquistaService;

import java.util.List;
import java.util.Optional;
@Service
public class ConquistaServiceImpl implements ConquistaService {
    @Autowired
    private ConquistaRepository conquistaRepository;

    @Override
    public Iterable<Conquista> buscarTodos() {
        List<Conquista> conquistas = conquistaRepository.findAll();
        return conquistas;
    }

    @Override
    public Conquista buscarPorId(Long id) {
        Optional<Conquista> conquista = conquistaRepository.findById(id);
        return conquista.get();
    }

    @Override
    public void inserir(Conquista conquista) {
        conquistaRepository.save(conquista);
    }

    @Override
    public void atualizar(Long id,Conquista conquista) {
        Optional<Conquista> conquistaBd = conquistaRepository.findById(id);
        if (conquistaBd.isPresent()){
            inserir(conquista);
        }
    }

    @Override
    public void deletar(Long id) {
        conquistaRepository.deleteById(id);
    }
}
