package ricardomoraesg.equipes.model;
import javax.persistence.*;

@Entity
public class Medalha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
    private String tipo;
    @Column(length = 10, nullable = false)
    private Integer pontos;
    public Medalha() {
        super();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }
}
