package ricardomoraesg.equipes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardomoraesg.equipes.model.Equipe;
import ricardomoraesg.equipes.repository.EquipeRepository;
import ricardomoraesg.equipes.service.EquipeService;

import java.util.List;
import java.util.Optional;
@Service
public class EquipeServiceImpl implements EquipeService {
    @Autowired
    EquipeRepository equipeRepository;


    @Override
    public Iterable<Equipe> buscarTodos() {
        List<Equipe> equipes = equipeRepository.findAll();
        return equipes;
    }


    @Override
    public Equipe buscarPorId(Long id) {
        Optional<Equipe> equipes = equipeRepository.findById(id);
        return equipes.get();
    }


    @Override
    public void inserir(Equipe equipe) {
        equipeRepository.save(equipe);
    }

    @Override
    public void atualizar(Long id, Equipe equipe) {
        Optional<Equipe> equipeBd = equipeRepository.findById(id);
        if (equipeBd.isPresent()){
            inserir(equipe);
        }
    }


    @Override
    public void deletar(Long id) {
        equipeRepository.deleteById(id);

    }
}
