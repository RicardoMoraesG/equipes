package ricardomoraesg.equipes.model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


//TODO: incluir Contrato para o participante.
//TODO: incluir Medalha para o participante.
//TODO: incluir Certificado para o participante.

@Entity
public class Integrante {

    //IDENTIFICAÇÃO NO SISTEMA.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 20, nullable = false)
    private java.lang.String usuario;
    @Column(length = 100, nullable = false)
    private java.lang.String senha;

    //DADOS PESSOAIS
    @Column(length = 100, nullable = false)
    private java.lang.String nome;
    @Column(length = 100)
    private java.lang.String sobrenome;
    @Column(length = 50, nullable = false)
    private java.lang.String email;
    @Column(length = 20, nullable = false)
    private java.lang.String telefone;

    //REGRA DE NEGÓCIO.
    /**
     * Exemplos: Matrícula no curso superior, clube esportivo ou empresa;
     */
    @Column(length = 100)
    private java.lang.String matriculaInstitucional;


    //CONTEXTOS DE PARTICIPAÇÃO NA EQUIPE.
    @OneToMany(fetch = FetchType.LAZY)
    private List<Conquista> conquistas = new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY)
    private Equipe equipe;
    @OneToOne(fetch = FetchType.LAZY)
    private Funcao funcao;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Contrato> contratos = new ArrayList<Contrato>();

    //CONSTRUTOR
    public Integrante(){

    }
    //GETTER/SETTER methods

    /**
     * Gera um novo Contrato para que o Integrante possa ser incluido em uma Equipe:
     * Inclui o Integrante e uma Funcao no Contrato;
     * Adiciona o Contrato na lista de Contratos do Integrante.
     * @param funcao
     */
    public void setContrato(Funcao funcao, String titulo, String descricao) {
        Contrato contrato = new Contrato(titulo, descricao, this, funcao);
        contratos.add(contrato);
    }



    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

      public void setConquistas(Conquista conquista) {
        conquistas.add(conquista);
    }
    public Equipe getEquipe() {
        return equipe;
    }

    /**
     * TODO: verificar o contrato e incluir na equipe.
     *
     * @param equipe
     */
    public void setEquipe(Equipe equipe, Contrato contrato) {
       //TODO: verificar contrato no BD.

       this.equipe = equipe;
    }
    public List<Conquista> getConquistas() {
        return conquistas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(java.lang.String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatriculaInstitucional() {
        return matriculaInstitucional;
    }

    public void setMatriculaInstitucional(String matriculaInstitucional) {
        this.matriculaInstitucional = matriculaInstitucional;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", matriculaInstitucional='" + matriculaInstitucional + '\'' +
                ", conquistas=" + conquistas +
                ", equipe=" + equipe +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Integrante)) return false;
        Integrante integrante = (Integrante) o;
        return Objects.equals(getId(), integrante.getId()) && Objects.equals(getUsuario(), integrante.getUsuario()) && Objects.equals(getSenha(), integrante.getSenha()) && Objects.equals(getNome(), integrante.getNome()) && Objects.equals(getSobrenome(), integrante.getSobrenome()) && Objects.equals(getEmail(), integrante.getEmail()) && Objects.equals(getTelefone(), integrante.getTelefone()) && Objects.equals(getMatriculaInstitucional(), integrante.getMatriculaInstitucional()) && Objects.equals(getConquistas(), integrante.getConquistas()) && Objects.equals(getEquipe(), integrante.getEquipe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsuario(), getSenha(), getNome(), getSobrenome(), getEmail(), getTelefone(), getMatriculaInstitucional(), getConquistas(), getEquipe());
    }
}
