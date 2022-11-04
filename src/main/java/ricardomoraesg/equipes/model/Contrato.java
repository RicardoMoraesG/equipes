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

        return "CONTRATO DE PRESTAÇÃO DE SERVIÇOS VOLUNTÁRIOS\n" +
                "\n" +
                "IDENTIFICAÇÃO DAS PARTES CONTRATANTES\n" +
                "       \n" +
                "        CONTRATANTE:\n" +
                "        VOLUNTÁRIO:  \n " +
                "        As partes acima identificadas têm, entre si, justo e acertado o presente Contrato de Prestação de Serviços Voluntários, que se regerá pelas cláusulas seguintes e pelas condições descritas no presente.       \n" +
                "\n" +
                "DO OBJETO DO CONTRATO\n" +
                "       \n" +
                "        Cláusula 1ª. O presente contrato tem como OBJETO, a prestação, pelo VOLUNTÁRIO, dos serviços de (xxx) (Descrever detalhadamente os serviços a serem prestados pelo voluntário).\n" +
                "\n" +
                "DAS OBRIGAÇÕES DAS PARTES\n" +
                "       \n" +
                "        Cláusula 2ª. O VOLUNTÁRIO fica comprometido a prestar ao CONTRATANTE: os serviços descritos cláusula anterior, durante (xxx) dias na semana, no horário de (xxx) às (xxx), estando obrigado por força do presente instrumento a cumprir os horários, que foram previamente e por ele mesmo fixados, de acordo com sua conveniência.\n" +
                "       \n" +
                "        Cláusula 3ª. O CONTRATANTE tem o dever de garantir ao VOLUNTÁRIO todas as condições para o desenvolvimento das atividades para ele designadas.\n" +
                "       \n" +
                "        Cláusula 4ª. O CONTRATANTE se responsabiliza, em caso de motivo de força maior, por avisar ao VOLUNTÁRIO quando for dispensá-lo dos seus serviços.\n" +
                "       \n" +
                "        Cláusula 5ª. Caso o VOLUNTÁRIO necessite, por qualquer motivo, de alterar os dias e horários de seus serviços, bem como de parar de prestá-los, deverá comunicar ao CONTRATANTE com antecedência mínima de (xxx) dias.\n" +
                "       \n" +

                "\n" +
                "DA REMUNERAÇÃO\n" +
                "\n" +
                "        Cláusula 6ª. O serviços prestados pelo VOLUNTÁRIO serão gratuitos, sendo de livre e expontânea vontade dele a sua prestação.\n" +
                "\n" +
                "DA RESCISÃO\n" +
                "\n" +
                "        Cláusula 7ª. O presente contrato poderá ser rescindido a qualquer tempo, por iniciativa de qualquer uma das partes, o que não irá acarretar em qualquer tipo de indenização para o VOLUNTÁRIO.\n" +
                "\n" +
                "DO PRAZO\n" +
                "        Cláusula 8ª. O presente contrato será de prazo indeterminado.\n" +
                "\n" +
                "DAS CONDIÇÕES GERAIS\n" +
                "        Cláusula 9ª. Este instrumento não cria vínculo de natureza trabalhista ou previdenciária entre as partes1.\n" +
                "       \n" +
                "        Cláusula 10ª. Este contrato passa a valer a partir da assinatura pelas partes.\n" +
                "DO FORO\n" +
                "        Cláusula 11ª. Para dirimir quaisquer controvérsias oriundas do CONTRATO, as partes elegem o foro da comarca de (xxx);\n" +
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
                "        1. Parágrafo único do artigo 1º da Lei nº 9.608/98." +
                "";
    }

}