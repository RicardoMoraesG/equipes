package ricardomoraesg.equipes.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "conquista")
public abstract class Conquista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String titulo;
    @Column(length = 100, nullable = false)
    private String descricao;

    @Override
    public String toString() {
        return "Conquista{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conquista)) return false;
        Conquista conquista = (Conquista) o;
        return Objects.equals(getId(), conquista.getId()) && Objects.equals(getTitulo(), conquista.getTitulo()) && Objects.equals(getDescricao(), conquista.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitulo(), getDescricao());
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}