package ricardomoraesg.equipes.service;
import ricardomoraesg.equipes.model.Contrato;
import ricardomoraesg.equipes.model.Entidade;
import ricardomoraesg.equipes.model.Integrante;

public interface ContratoService {

    Iterable<Contrato> buscarTodos();
    Contrato buscarPorId(Long id);
    Contrato inserir(Contrato contrato);
    void atualizar(Long id, Contrato contrato);
    void deletar(Long id);
}
