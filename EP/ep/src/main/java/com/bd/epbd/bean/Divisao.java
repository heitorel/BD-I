package com.bd.epbd.bean;

public class Divisao {

    public Integer id;
    public Integer baixas;
    public Integer barcos;
    public Integer homens;
    public Integer tanques;
    public Integer avioes;
    public Integer idGrupoArmado;
    public Integer idChefeMilitar;

    public Divisao(Integer id, Integer baixas, Integer barcos, Integer homens, Integer tanques, Integer avioes, Integer idGrupoArmado, Integer idChefeMilitar) {
        this.id = id;
        this.baixas = baixas;
        this.barcos = barcos;
        this.homens = homens;
        this.tanques = tanques;
        this.avioes = avioes;
        this.idGrupoArmado = idGrupoArmado;
        this.idChefeMilitar = idChefeMilitar;
    }

    public Divisao() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBaixas() {
        return baixas;
    }

    public void setBaixas(Integer baixas) {
        this.baixas = baixas;
    }

    public Integer getBarcos() {
        return barcos;
    }

    public void setBarcos(Integer barcos) {
        this.barcos = barcos;
    }

    public Integer getHomens() {
        return homens;
    }

    public void setHomens(Integer homens) {
        this.homens = homens;
    }

    public Integer getTanques() {
        return tanques;
    }

    public void setTanques(Integer tanques) {
        this.tanques = tanques;
    }

    public Integer getAvioes() {
        return avioes;
    }

    public void setAvioes(Integer avioes) {
        this.avioes = avioes;
    }

    public Integer getIdGrupoArmado() {
        return idGrupoArmado;
    }

    public void setIdGrupoArmado(Integer idGrupoArmado) {
        this.idGrupoArmado = idGrupoArmado;
    }

    public Integer getIdChefeMilitar() {
        return idChefeMilitar;
    }

    public void setIdChefeMilitar(Integer idChefeMilitar) {
        this.idChefeMilitar = idChefeMilitar;
    }
}
