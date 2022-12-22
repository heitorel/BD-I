package com.bd.epbd.bean;

public class OcorrenciaTiposConflitos {

    public String tipo;
    public  Integer ocorrencia;

    public OcorrenciaTiposConflitos(String tipo, Integer ocorrencia) {
        this.tipo = tipo;
        this.ocorrencia = ocorrencia;
    }

    public OcorrenciaTiposConflitos() {
    }

    @Override
    public String toString() {
        return "OcorrenciaTiposConflitos{" +
                "tipo='" + tipo + '\'' +
                ", ocorrencia=" + ocorrencia +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Integer ocorrencia) {
        this.ocorrencia = ocorrencia;
    }
}
