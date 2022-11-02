package ricardomoraesg.equipes.model;
import javax.persistence.Entity;
@Entity
public class Medalha extends Conquista{
    public Medalha() {
        super();
    }
    @Override
    public String toString() {
        return "Medalha{}";
    }
}
