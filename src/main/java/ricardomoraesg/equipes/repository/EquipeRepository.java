package ricardomoraesg.equipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ricardomoraesg.equipes.model.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
