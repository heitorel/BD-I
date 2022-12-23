package com.bd.epbd.bean;

public class OrganizacaoMediadora {

    public Integer id;
    public Integer pessoasAtuando;
    public String nome;
    public Integer idGrupo;
    public Integer idConflito;
    public Integer mediacoes;

    public OrganizacaoMediadora() {
    }

    public OrganizacaoMediadora(Integer id, Integer pessoasAtuando, String nome, Integer idGrupo, Integer idConflito) {
        this.id = id;
        this.pessoasAtuando = pessoasAtuando;
        this.nome = nome;
        this.idGrupo = idGrupo;
        this.idConflito = idConflito;
    }

    public Integer getMediacoes() {
        return mediacoes;
    }

    public void setMediacoes(Integer mediacoes) {
        this.mediacoes = mediacoes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPessoasAtuando() {
        return pessoasAtuando;
    }

    public void setPessoasAtuando(Integer pessoasAtuando) {
        this.pessoasAtuando = pessoasAtuando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getIdConflito() {
        return idConflito;
    }

    public void setIdConflito(Integer idConflito) {
        this.idConflito = idConflito;
    }

    @Override
    public String toString() {
        return "OrganizacaoMediadora{" +
                "id=" + id +
                ", pessoasAtuando=" + pessoasAtuando +
                ", nome='" + nome + '\'' +
                ", idGrupo=" + idGrupo +
                ", idConflito=" + idConflito + '\'' +
                ", mediacoes=" + mediacoes +
                '}';
    }
}
