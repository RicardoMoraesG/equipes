package ricardomoraesg.equipes.service;


import ricardomoraesg.equipes.model.Entidade;

public interface EntidadeService {
    Iterable<Entidade> buscarTodos();
    Entidade buscarPorId(Long id);
    void inserir(Entidade entidade);
    void atualizar(Long id, Entidade entidade);
    void deletar(Long id);
}
