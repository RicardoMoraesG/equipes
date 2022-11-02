package ricardomoraesg.equipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ricardomoraesg.equipes.model.Entidade;

public interface EntidadeRepository extends JpaRepository<Entidade, Long> {
}
