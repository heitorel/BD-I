package com.bd.epbd.bean;

public class ConflitoBelico {

    private Integer id;
    private Integer mortos;
    private Integer feridos;
    private Integer idGrupo;
    private Integer flag_territorial;
    private Integer flag_religioso;
    private Integer flag_economico;
    private Integer flag_racial;


    public ConflitoBelico() {
    }

    public ConflitoBelico(Integer id, Integer mortos, Integer feridos, Integer idGrupo,
                          Integer flag_territorial, Integer flag_religioso, Integer flag_economico, Integer flag_racial) {
        this.id = id;
        this.mortos = mortos;
        this.feridos = feridos;
        this.idGrupo = idGrupo;
        this.flag_territorial = flag_territorial;
        this.flag_religioso = flag_religioso;
        this.flag_economico = flag_economico;
        this.flag_racial = flag_racial;
    }

    public Integer getFlag_territorial() {
        return flag_territorial;
    }

    public void setFlag_territorial(Integer flag_territorial) {
        this.flag_territorial = flag_territorial;
    }

    public Integer getFlag_religioso() {
        return flag_religioso;
    }

    public void setFlag_religioso(Integer flag_religioso) {
        this.flag_religioso = flag_religioso;
    }

    public Integer getFlag_economico() {
        return flag_economico;
    }

    public void setFlag_economico(Integer flag_economico) {
        this.flag_economico = flag_economico;
    }

    public Integer getFlag_racial() {
        return flag_racial;
    }

    public void setFlag_racial(Integer flag_racial) {
        this.flag_racial = flag_racial;
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
