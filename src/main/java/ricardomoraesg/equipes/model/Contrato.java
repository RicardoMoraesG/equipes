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
    @ManyToOne
    @JoinColumn(name = "entidade_id")
    private Entidade entidade;

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }


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
    public String contratoPadraoVoluntarios(Long entidadeId, Long integranteId){

        return "CONTRATO DE PRESTA????O DE SERVI??OS VOLUNT??RIOS\n" +
                "\n" +
                "IDENTIFICA????O DAS PARTES CONTRATANTES\n" +
                "       \n" +
                "        CONTRATANTE:\n" +
                "        VOLUNT??RIO:  \n " +
                "        As partes acima identificadas t??m, entre si, justo e acertado o presente Contrato de Presta????o de Servi??os Volunt??rios, que se reger?? pelas cl??usulas seguintes e pelas condi????es descritas no presente.       \n" +
                "\n" +
                "DO OBJETO DO CONTRATO\n" +
                "       \n" +
                "        Cl??usula 1??. O presente contrato tem como OBJETO, a presta????o, pelo VOLUNT??RIO, dos servi??os de (xxx) (Descrever detalhadamente os servi??os a serem prestados pelo volunt??rio).\n" +
                "\n" +
                "DAS OBRIGA????ES DAS PARTES\n" +
                "       \n" +
                "        Cl??usula 2??. O VOLUNT??RIO fica comprometido a prestar ao CONTRATANTE: os servi??os descritos cl??usula anterior, durante (xxx) dias na semana, no hor??rio de (xxx) ??s (xxx), estando obrigado por for??a do presente instrumento a cumprir os hor??rios, que foram previamente e por ele mesmo fixados, de acordo com sua conveni??ncia.\n" +
                "       \n" +
                "        Cl??usula 3??. O CONTRATANTE tem o dever de garantir ao VOLUNT??RIO todas as condi????es para o desenvolvimento das atividades para ele designadas.\n" +
                "       \n" +
                "        Cl??usula 4??. O CONTRATANTE se responsabiliza, em caso de motivo de for??a maior, por avisar ao VOLUNT??RIO quando for dispens??-lo dos seus servi??os.\n" +
                "       \n" +
                "        Cl??usula 5??. Caso o VOLUNT??RIO necessite, por qualquer motivo, de alterar os dias e hor??rios de seus servi??os, bem como de parar de prest??-los, dever?? comunicar ao CONTRATANTE com anteced??ncia m??nima de (xxx) dias.\n" +
                "       \n" +

                "\n" +
                "DA REMUNERA????O\n" +
                "\n" +
                "        Cl??usula 6??. O servi??os prestados pelo VOLUNT??RIO ser??o gratuitos, sendo de livre e expont??nea vontade dele a sua presta????o.\n" +
                "\n" +
                "DA RESCIS??O\n" +
                "\n" +
                "        Cl??usula 7??. O presente contrato poder?? ser rescindido a qualquer tempo, por iniciativa de qualquer uma das partes, o que n??o ir?? acarretar em qualquer tipo de indeniza????o para o VOLUNT??RIO.\n" +
                "\n" +
                "DO PRAZO\n" +
                "        Cl??usula 8??. O presente contrato ser?? de prazo indeterminado.\n" +
                "\n" +
                "DAS CONDI????ES GERAIS\n" +
                "        Cl??usula 9??. Este instrumento n??o cria v??nculo de natureza trabalhista ou previdenci??ria entre as partes1.\n" +
                "       \n" +
                "        Cl??usula 10??. Este contrato passa a valer a partir da assinatura pelas partes.\n" +
                "DO FORO\n" +
                "        Cl??usula 11??. Para dirimir quaisquer controv??rsias oriundas do CONTRATO, as partes elegem o foro da comarca de (xxx);\n" +
                "              \n" +
                "              \n" +
                "        Por estarem assim justos e contratados, firmam o presente instrumento, em duas vias de igual teor, juntamente com 2 (duas) testemunhas.\n" +
                "              \n" +
                "              \n" +
                "        (Local, data e ano).\n" +
                "       \n" +
                "       \n" +
                "        (Nome e assinatura do Contratante)\n" +
                "       \n" +
                "        (Nome e assinatura do Contratado)\n" +
                "              \n" +
                "        (Nome, RG e assinatura da Testemunha 1)\n" +
                "       \n" +
                "        (Nome, RG e assinatura da Testemunha 2)\n" +
                "       \n" +
                "       \n" +
                "        ________\n" +
                "        Nota:\n" +
                "              \n" +
                "        1. Par??grafo ??nico do artigo 1?? da Lei n?? 9.608/98." +
                "";
    }

}