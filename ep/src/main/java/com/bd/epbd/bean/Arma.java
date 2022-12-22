package com.bd.epbd.bean;

public class Arma {

    public String nome;
    public Integer capacidadeDestrutiva;

    public Arma() {
    }

    public Arma(String nome, Integer capacidadeDestrutiva) {
        this.nome = nome;
        this.capacidadeDestrutiva = capacidadeDestrutiva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCapacidadeDestrutiva() {
        return capacidadeDestrutiva;
    }

    public void setCapacidadeDestrutiva(Integer capacidadeDestrutiva) {
        this.capacidadeDestrutiva = capacidadeDestrutiva;
    }
}
