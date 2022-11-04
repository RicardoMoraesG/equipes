package ricardomoraesg.equipes.model;
import javax.persistence.*;

@Entity
public class Certificado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String titulo;
    @Column(length = 300, nullable = false)
    private String descricao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
