package ricardomoraesg.equipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ricardomoraesg.equipes.model.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Long> {
}
