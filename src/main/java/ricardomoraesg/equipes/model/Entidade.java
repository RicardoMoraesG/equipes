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

}
