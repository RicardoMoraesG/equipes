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
    private String usuario;
    @Column(length = 100, nullable = false)
    private String senha;

    //DADOS PESSOAIS
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 100)
    private String sobrenome;
    @Column(length = 50, nullable = false)
    private String email;
    @Column(length = 20, nullable = false)
    private String telefone;

    //REGRA DE NEGÓCIO.
    /**
     * Exemplos: Matrícula no curso superior, clube esportivo ou empresa;
     */
    @Column(length = 100)
    private String matriculaInstitucional;


    //CONTEXTOS DE PARTICIPAÇÃO NA EQUIPE.
    @OneToMany(fetch = FetchType.LAZY)
    private List<Medalha> medalhas = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY)
    private List<Certificado> certificados = new ArrayList<>();
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
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

    public List<Medalha> getMedalhas() {
        return medalhas;
    }

    public void setMedalhas(List<Medalha> medalhas) {
        this.medalhas = medalhas;
    }

    public List<Certificado> getCertificados() {
        return certificados;
    }

    public void setCertificados(List<Certificado> certificados) {
        this.certificados = certificados;
    }

    public Equipe getEquipe() {
        return equipe;
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

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Integrante)) return false;
        Integrante that = (Integrante) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getUsuario(), that.getUsuario()) && Objects.equals(getSenha(), that.getSenha()) && Objects.equals(getNome(), that.getNome()) && Objects.equals(getSobrenome(), that.getSobrenome()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getTelefone(), that.getTelefone()) && Objects.equals(getMatriculaInstitucional(), that.getMatriculaInstitucional()) && Objects.equals(getMedalhas(), that.getMedalhas()) && Objects.equals(getCertificados(), that.getCertificados()) && Objects.equals(getEquipe(), that.getEquipe()) && Objects.equals(getFuncao(), that.getFuncao()) && Objects.equals(getContratos(), that.getContratos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsuario(), getSenha(), getNome(), getSobrenome(), getEmail(), getTelefone(), getMatriculaInstitucional(), getMedalhas(), getCertificados(), getEquipe(), getFuncao(), getContratos());
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
                ", medalhas=" + medalhas +
                ", certificados=" + certificados +
                ", equipe=" + equipe +
                ", funcao=" + funcao +
                ", contratos=" + contratos +
                '}';
    }
}
