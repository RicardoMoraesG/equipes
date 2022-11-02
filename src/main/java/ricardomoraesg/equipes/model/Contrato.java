package ricardomoraesg.equipes.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String descricao;
    //RELACIONAMENTOS
    @ManyToOne
    @JoinColumn(name = "integrante_id")
    private Integrante integrante;
    @OneToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;
    @OneToOne
    @JoinColumn(name = "funcao_id")
    private Funcao funcao;


    public Contrato() {
    }

    public Contrato(String titulo, String descricao, Integrante integrante, Funcao funcao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.integrante = integrante;
        this.funcao = funcao;
    }

    //GETTER AND SETTER

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contrato)) return false;
        Contrato contrato = (Contrato) o;
        return Objects.equals(getId(), contrato.getId()) && Objects.equals(getTitulo(), contrato.getTitulo()) && Objects.equals(getDescricao(), contrato.getDescricao()) && Objects.equals(getIntegrante(), contrato.getIntegrante()) && Objects.equals(getFuncao(), contrato.getFuncao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitulo(), getDescricao(), getIntegrante(), getFuncao());
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", integrante=" + integrante +
                ", funcao=" + funcao +
                '}';
    }
}