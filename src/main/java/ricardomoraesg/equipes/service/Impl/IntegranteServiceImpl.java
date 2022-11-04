package ricardomoraesg.equipes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardomoraesg.equipes.model.Integrante;
import ricardomoraesg.equipes.repository.IntegranteRepository;
import ricardomoraesg.equipes.service.IntegranteService;
import java.util.Optional;

@Service
public class IntegranteServiceImpl implements IntegranteService {
    //Singleton: Injetar os componentes do Spring com @Autowired
    @Autowired
    private IntegranteRepository integranteRepository;

    @Override
    public Iterable<Integrante> buscarTodos() {
        return integranteRepository.findAll();
    }

    @Override
    public Integrante buscarPorId(Long id) {
        Optional<Integrante> integrante = integranteRepository.findById(id);
        return integrante.get();
    }

    @Override
    public void inserir(Integrante integrante) {
    integranteRepository.save(integrante);
    }

    @Override
    public void atualizar(Long id, Integrante integrante) {
        Optional<Integrante> integranteBd = integranteRepository.findById(id);
        if (integranteBd.isPresent()){
            inserir(integrante);
        }
    }

    @Override
    public void deletar(Long id) {
    integranteRepository.deleteById(id);
    }
}
