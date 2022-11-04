package ricardomoraesg.equipes.service;
import ricardomoraesg.equipes.model.Medalha;

public interface MedalhaService {

    Iterable<Medalha> buscarTodos();
    Medalha buscarPorId(Long id);
    void inserir(Medalha medalha);
    void atualizar(Long id, Medalha meddalha);
    void deletar(Long id);
}
