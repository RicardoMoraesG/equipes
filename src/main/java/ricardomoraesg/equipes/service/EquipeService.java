package ricardomoraesg.equipes.service;


import ricardomoraesg.equipes.model.Equipe;

public interface EquipeService {
    Iterable<Equipe> buscarTodos();
    Equipe buscarPorId(Long id);
    void inserir(Equipe equipe);
    void atualizar(Long id, Equipe equipe);
    void deletar(Long id);
}
