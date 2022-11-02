package ricardomoraesg.equipes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardomoraesg.equipes.model.Contrato;
import ricardomoraesg.equipes.repository.ContratoRepository;
import ricardomoraesg.equipes.service.ContratoService;

import java.util.List;
import java.util.Optional;

@Service
public class ContratoServiceImpl implements ContratoService {
    @Autowired
    ContratoRepository contratoRepository;
    @Override
    public Iterable<Contrato> buscarTodos() {
        List<Contrato> contrato = contratoRepository.findAll();
        return contrato;
    }

    @Override
    public Contrato buscarPorId(Long id) {
        Optional<Contrato> contrato = contratoRepository.findById(id);
        return contrato.get();
    }

    @Override
    public void inserir(Contrato contrato) {
        contratoRepository.save(contrato);
    }

    @Override
    public void atualizar(Long id,Contrato contrato) {
        Optional<Contrato> contratoBd = contratoRepository.findById(id);
        if (contratoBd.isPresent()){
            inserir(contrato);
        }
    }

    @Override
    public void deletar(Long id) {
        contratoRepository.deleteById(id);
    }
}
