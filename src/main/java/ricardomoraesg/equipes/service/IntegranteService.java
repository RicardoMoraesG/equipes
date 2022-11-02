package ricardomoraesg.equipes.service;

import ricardomoraesg.equipes.model.Integrante;

public interface IntegranteService {
    Iterable<Integrante> buscarTodos();
    Integrante buscarPorId(Long id);
    void inserir(Integrante integrante);
    void atualizar(Long id, Integrante integrante);
    void deletar(Long id);
}
