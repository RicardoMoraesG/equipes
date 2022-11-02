package ricardomoraesg.equipes.service;
import ricardomoraesg.equipes.model.Contrato;

public interface ContratoService {

    Iterable<Contrato> buscarTodos();
    Contrato buscarPorId(Long id);
    void inserir(Contrato contrato);
    void atualizar(Long id, Contrato contrato);
    void deletar(Long id);
}
