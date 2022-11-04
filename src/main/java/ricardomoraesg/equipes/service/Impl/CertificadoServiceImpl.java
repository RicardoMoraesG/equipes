package ricardomoraesg.equipes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardomoraesg.equipes.model.Certificado;
import ricardomoraesg.equipes.repository.CertificadoRepository;
import ricardomoraesg.equipes.service.CertificadoService;

import java.util.List;
import java.util.Optional;

@Service
public class CertificadoServiceImpl implements CertificadoService {
    @Autowired
    private CertificadoRepository certificadoRepository;

    @Override
    public Iterable<Certificado> buscarTodos() {
        List<Certificado> certificado = certificadoRepository.findAll();
        return certificado;
    }

    @Override
    public Certificado buscarPorId(Long id) {
        Optional<Certificado> certificado = certificadoRepository.findById(id);
        return certificado.get();
    }

    @Override
    public void inserir(Certificado certificado) {
        certificadoRepository.save(certificado);
    }

    @Override
    public void atualizar(Long id,Certificado certificado) {
        Optional<Certificado> certificadoBd = certificadoRepository.findById(id);
        if (certificadoBd.isPresent()){
            inserir(certificado);
        }
    }

    @Override
    public void deletar(Long id) {
        certificadoRepository.deleteById(id);
    }
}
