package com.bd.epbd.bean;

public class LiderPolitico {

    public String nome;
    public String apoios;
    public Integer idDivisao;
    public Integer idGrupoArmado;

    public LiderPolitico(String nome, String apoios, Integer idDivisao, Integer idGrupoArmado) {
        this.nome = nome;
        this.apoios = apoios;
        this.idDivisao = idDivisao;
        this.idGrupoArmado = idGrupoArmado;
    }

    public LiderPolitico() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApoios() {
        return apoios;
    }

    public void setApoios(String apoios) {
        this.apoios = apoios;
    }

    public Integer getIdDivisao() {
        return idDivisao;
    }

    public void setIdDivisao(Integer idDivisao) {
        this.idDivisao = idDivisao;
    }

    public Integer getIdGrupoArmado() {
        return idGrupoArmado;
    }

    public void setIdGrupoArmado(Integer idGrupoArmado) {
        this.idGrupoArmado = idGrupoArmado;
    }
}
