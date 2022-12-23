package com.bd.epbd.bean;

public class GrupoArmado {

    public Integer id;
    public String nome;
    public String traficanteDeArmas;
    public Integer armasPorTraficante;
    public String lideresPoliticos;
    public Integer baixas_totais;
    public Integer ID_Divisao;

    public GrupoArmado(Integer id, String traficanteDeArmas, Integer armasPorTraficante, String lideresPoliticos, Integer baixas_totais, Integer ID_Divisao) {
        this.baixas_totais = baixas_totais;
        this.id = id;
        this.traficanteDeArmas = traficanteDeArmas;
        this.armasPorTraficante = armasPorTraficante;
        this.lideresPoliticos = lideresPoliticos;
        this.ID_Divisao = ID_Divisao;
    }

    public GrupoArmado() {
    }

    @Override
    public String toString() {
        return "GrupoArmado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", traficanteDeArmas='" + traficanteDeArmas + '\'' +
                ", armasPorTraficante=" + armasPorTraficante +
                ", lideresPoliticos='" + lideresPoliticos + '\'' +
                ", baixas_totais=" + baixas_totais +
                ", ID_Divisao=" + ID_Divisao +
                '}';
    }

    public Integer getID_Divisao() {
        return ID_Divisao;
    }

    public void setID_Divisao(Integer ID_Divisao) {
        this.ID_Divisao = ID_Divisao;
    }

    public Integer getBaixas_totais() {
        return baixas_totais;
    }

    public void setBaixas_totais(Integer baixas_totais) {
        this.baixas_totais = baixas_totais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTraficanteDeArmas() {
        return traficanteDeArmas;
    }

    public void setTraficanteDeArmas(String traficanteDeArmas) {
        this.traficanteDeArmas = traficanteDeArmas;
    }

    public Integer getArmasPorTraficante() {
        return armasPorTraficante;
    }

    public void setArmasPorTraficante(Integer armasPorTraficante) {
        this.armasPorTraficante = armasPorTraficante;
    }

    public String getLideresPoliticos() {
        return lideresPoliticos;
    }

    public void setLideresPoliticos(String lideresPoliticos) {
        this.lideresPoliticos = lideresPoliticos;
    }
}
