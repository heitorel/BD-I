package com.bd.epbd.bean;

public class PaisesConflitos {

    public Integer id;
    public Integer quantidade;

    public PaisesConflitos(Integer id, Integer quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public PaisesConflitos() {
    }

    public Integer getNome() {
        return id;
    }

    public void setNome(Integer nome) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "PaisesConflitos{" +
                "id='" + id + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
