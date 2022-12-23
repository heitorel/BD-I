package com.bd.epbd.bean;

public class Traficante {

    private String armasPorTraficante;
    private String nome;

    public Traficante(String armasPorTraficante, String nome) {
        this.armasPorTraficante = armasPorTraficante;
        this.nome = nome;
    }

    public Traficante() {
    }

    public String getArmasPorTraficante() {
        return armasPorTraficante;
    }

    public void setArmasPorTraficante(String armasPorTraficante) {
        this.armasPorTraficante = armasPorTraficante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
