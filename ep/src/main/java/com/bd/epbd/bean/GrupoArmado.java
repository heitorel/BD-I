package com.bd.epbd.bean;

public class GrupoArmado {

    public Integer id;
    public String nome;
    public String traficanteDeArmas;
    public Integer armasPorTraficante;
    public String lideresPoliticos;

    public GrupoArmado(Integer id, String traficanteDeArmas, Integer armasPorTraficante, String lideresPoliticos) {
        this.id = id;
        this.traficanteDeArmas = traficanteDeArmas;
        this.armasPorTraficante = armasPorTraficante;
        this.lideresPoliticos = lideresPoliticos;
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
                '}';
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
