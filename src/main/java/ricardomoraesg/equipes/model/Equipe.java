package ricardomoraesg.equipes.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
//TODO: incluir Integrante na equipe: incluir Contrato para o novo integrante.


/**
 * Classe que representa uma equipe com a relação dos integrantes.
 */
@Entity
@Table(name = "equipe")
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private java.lang.String nome;
    @OneToMany
    @JoinColumn(name = "integrante_id")
    private List<Integrante> integrantes;

    @OneToMany
    @JoinColumn(name = "funcao_id")
    private List<Funcao> funcoes;

    //CONSTRUTOR
    public Equipe() {
    }
    //GETTER AND SETTER

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public java.lang.String getNome() {
        return nome;
    }
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }
    public List<Integrante> getIntegrantes() {
        return integrantes;
    }
    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public List<Funcao> getFuncoes() {
        return funcoes;
    }

    public void setFuncoes(List<Funcao> funcoes) {
        this.funcoes = funcoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipe)) return false;
        Equipe equipe = (Equipe) o;
        return Objects.equals(getId(), equipe.getId()) && Objects.equals(getNome(), equipe.getNome()) && Objects.equals(getIntegrantes(), equipe.getIntegrantes());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getIntegrantes());
    }
    @Override
    public java.lang.String toString() {
        return "Equipe{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", integrantes=" + integrantes +
                '}';
    }


}