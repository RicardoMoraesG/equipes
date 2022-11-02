package ricardomoraesg.equipes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardomoraesg.equipes.model.Funcao;
import ricardomoraesg.equipes.repository.FuncaoRepository;
import ricardomoraesg.equipes.service.FuncaoService;

import java.util.List;
import java.util.Optional;
@Service
public class FuncaoServiceImpl implements FuncaoService {
    @Autowired
    FuncaoRepository funcaoRepository;


    @Override
    public Iterable<Funcao> buscarTodos() {
        List<Funcao> funcoes = funcaoRepository.findAll();
        return funcoes;
    }
    @Override
    public Funcao buscarPorId(String id) {
       Optional<Funcao> funcao = funcaoRepository.findById(id);
       return funcao.get();
    }

    @Override
    public void inserir(Funcao funcao) {
        funcaoRepository.save(funcao);

    }

    @Override
    public void atualizar(String id, Funcao funcao) {
        Optional<Funcao> funcaoBd = funcaoRepository.findById(id);
        if(funcaoBd.isPresent()){
            inserir(funcao);
        }
    }
    @Override
    public void deletar(String id) {
        funcaoRepository.deleteById(id);
    }
}
