package ricardomoraesg.equipes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardomoraesg.equipes.model.Medalha;
import ricardomoraesg.equipes.repository.MedalhaRepository;
import ricardomoraesg.equipes.service.MedalhaService;

import java.util.List;
import java.util.Optional;

@Service
public class MedalhaServiceImpl implements MedalhaService {
    @Autowired
    private MedalhaRepository medalhaRepository;

    @Override
    public Iterable<Medalha> buscarTodos() {
        List<Medalha> medalha = medalhaRepository.findAll();
        return medalha;
    }

    @Override

    public Medalha buscarPorId(Long id) {
        Optional<Medalha> medalha = medalhaRepository.findById(id);
        return medalha.get();
    }

    @Override
    public void inserir(Medalha medalha) {
        medalhaRepository.save(medalha);
    }

    @Override
    public void atualizar(Long id,Medalha medalha) {
        Optional<Medalha> medalhaBd = medalhaRepository.findById(id);
        if (medalhaBd.isPresent()){
            inserir(medalha);
        }
    }

    @Override
    public void deletar(Long id) {
        medalhaRepository.deleteById(id);
    }
}
