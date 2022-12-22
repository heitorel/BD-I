package com.bd.epbd.bean;

import java.sql.Date;

public class GrupoMilitar {

    public Integer id;
    public Integer conflitos;
    public String nome;
    public Date dataSaida;
    public Date dataEntrada;

    public GrupoMilitar(Integer id, Integer conflitos, String nome, Date dataSaida, Date dataEntrada) {
        this.id = id;
        this.conflitos = conflitos;
        this.nome = nome;
        this.dataSaida = dataSaida;
        this.dataEntrada = dataEntrada;
    }

    public GrupoMilitar() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConflitos() {
        return conflitos;
    }

    public void setConflitos(Integer conflitos) {
        this.conflitos = conflitos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
