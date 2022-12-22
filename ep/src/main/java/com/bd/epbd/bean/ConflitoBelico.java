package com.bd.epbd.bean;

public class ConflitoBelico {

    private Integer id;
    private Integer mortos;
    private Integer feridos;
    private Integer idGrupo;

    public ConflitoBelico() {
    }

    public ConflitoBelico(Integer id, Integer mortos, Integer feridos,  Integer idGrupo) {
        this.id = id;
        this.mortos = mortos;
        this.feridos = feridos;
        this.idGrupo = idGrupo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMortos() {
        return mortos;
    }

    public void setMortos(Integer mortos) {
        this.mortos = mortos;
    }

    public Integer getFeridos() {
        return feridos;
    }

    public void setFeridos(Integer feridos) {
        this.feridos = feridos;
    }


    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Override
    public String toString() {
        return "ConflitoBelico{" +
                "id=" + id +
                ", mortos=" + mortos +
                ", feridos=" + feridos +
                ", idGrupo=" + idGrupo +
                '}';
    }
}
