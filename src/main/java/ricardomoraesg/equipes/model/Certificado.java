package ricardomoraesg.equipes.model;
import javax.persistence.Entity;
@Entity
public class Certificado extends Conquista{
    public Certificado() {
        super();
    }
    @Override
    public String toString() {
        return "Certificado{}";
    }
}
