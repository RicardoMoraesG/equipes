package ricardomoraesg.equipes.service;


import ricardomoraesg.equipes.model.Funcao;

public interface FuncaoService {
    Iterable<Funcao> buscarTodos();
    Funcao buscarPorId(String id);
    void inserir(Funcao funcao);
    void atualizar(String id, Funcao funcao);
    void deletar(String id);
}
