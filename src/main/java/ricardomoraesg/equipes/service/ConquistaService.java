package ricardomoraesg.equipes.service;

import ricardomoraesg.equipes.model.Conquista;

public interface ConquistaService {

    Iterable<Conquista> buscarTodos();
    Conquista buscarPorId(Long id);
    void inserir(Conquista conquista);
    void atualizar(Long id, Conquista conquista);
    void deletar(Long id);
}
