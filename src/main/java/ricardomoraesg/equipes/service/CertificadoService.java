package ricardomoraesg.equipes.service;

import org.springframework.stereotype.Service;
import ricardomoraesg.equipes.model.Certificado;
@Service
public interface CertificadoService {
    Iterable<Certificado> buscarTodos();
    Certificado buscarPorId(Long id);
    void inserir(Certificado certificado);
    void atualizar(Long id, Certificado certificado);
    void deletar(Long id);
}
