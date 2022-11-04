package ricardomoraesg.equipes.model;

import javax.persistence.*;
import java.util.List;

/**
 * Classe Mãe da aplicação.
 * Instanciada apenas uma vez, englobando todas as equipes.
 */
@Entity
public final class Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private String missao;
    @Column
    private String visao;
    @Column
    private String valores;

    @OneToMany
    @JoinColumn(name = "equipe_id")
    private List<Equipe> equipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getVisao() {
        return visao;
    }

    public void setVisao(String visao) {
        this.visao = visao;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }
}
