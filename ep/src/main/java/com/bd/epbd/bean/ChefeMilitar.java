package com.bd.epbd.bean;

public class ChefeMilitar {

    public Integer id;
    public String hierarquia;
    public Integer idDivisao;
    public String nomeLiderPolitico;

    public ChefeMilitar() {
    }

    public ChefeMilitar(Integer id, String hierarquia, Integer idDivisao, String nomeLiderPolitico) {
        this.id = id;
        this.hierarquia = hierarquia;
        this.idDivisao = idDivisao;
        this.nomeLiderPolitico = nomeLiderPolitico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(String hierarquia) {
        this.hierarquia = hierarquia;
    }

    public Integer getIdDivisao() {
        return idDivisao;
    }

    public void setIdDivisao(Integer idDivisao) {
        this.idDivisao = idDivisao;
    }

    public String getNomeLiderPolitico() {
        return nomeLiderPolitico;
    }

    public void setNomeLiderPolitico(String nomeLiderPolitico) {
        this.nomeLiderPolitico = nomeLiderPolitico;
    }
}
