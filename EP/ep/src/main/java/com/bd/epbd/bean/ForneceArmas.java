package com.bd.epbd.bean;

public class ForneceArmas {

    public String traficante;
    public Integer ID_Grupo_Armado;

    public ForneceArmas(String traficante, Integer ID_Grupo_Armado) {
        this.traficante = traficante;
        this.ID_Grupo_Armado = ID_Grupo_Armado;
    }

    public ForneceArmas() {
    }

    @Override
    public String toString() {
        return "ForneceArmas{" +
                "traficante='" + traficante + '\'' +
                ", ID_Grupo_Armado=" + ID_Grupo_Armado +
                '}';
    }

    public String getTraficante() {
        return traficante;
    }

    public void setTraficante(String traficante) {
        this.traficante = traficante;
    }

    public Integer getID_Grupo_Armado() {
        return ID_Grupo_Armado;
    }

    public void setID_Grupo_Armado(Integer ID_Grupo_Armado) {
        this.ID_Grupo_Armado = ID_Grupo_Armado;
    }
}
