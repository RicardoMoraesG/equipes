package ricardomoraesg.equipes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardomoraesg.equipes.model.Entidade;
import ricardomoraesg.equipes.repository.EntidadeRepository;
import ricardomoraesg.equipes.service.EntidadeService;
import java.util.List;
import java.util.Optional;

@Service
public class EntidadeServiceImpl implements EntidadeService {
    @Autowired
    EntidadeRepository entidadeRepository;

    @Override
    public Iterable<Entidade> buscarTodos() {
        List<Entidade> entidades = entidadeRepository.findAll();
        return entidades;
    }

    @Override
    public Entidade buscarPorId(Long id) {
        Optional<Entidade> entidade = entidadeRepository.findById(id);
        return entidade.get();
    }


    @Override
    public void inserir(Entidade entidade) {
        entidadeRepository.save(entidade);
    }


    @Override
    public void atualizar(Long id, Entidade entidade) {
        Optional<Entidade> entidadeBd = entidadeRepository.findById(id);
        if(entidadeBd.isPresent()){
            inserir(entidade);
        }

    }


    @Override
    public void deletar(Long id) {
        entidadeRepository.deleteById(id);

    }
}
