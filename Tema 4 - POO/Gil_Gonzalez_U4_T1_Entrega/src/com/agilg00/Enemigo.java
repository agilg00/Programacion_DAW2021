package com.agilg00;

public class Enemigo {


    private TipoEnemigo tipoEnemigo;
    private int pvida;
    private int pdanyo;

    public Enemigo(TipoEnemigo tipoEnemigo, int pvida, int pdanyo) {
        this.tipoEnemigo = tipoEnemigo;
        this.pvida = pvida;
        this.pdanyo = pdanyo;
    }

    public TipoEnemigo getTipoEnemigo() {
        return tipoEnemigo;
    }

    public void setTipoEnemigo(TipoEnemigo tipoEnemigo) {
        this.tipoEnemigo = tipoEnemigo;
    }

    public int getPvida() {
        return pvida;
    }

    public void setPvida(int pvida) {
        this.pvida = pvida;
    }

    public int getPdanyo() {
        return pdanyo;
    }

    public void setPdanyo(int pdanyo) {
        this.pdanyo = pdanyo;
    }



    @Override
    public String toString() {
        return "Enemigo{" +
                "tipoEnemigo=" + tipoEnemigo +
                ", puntos vida=" + pvida +
                ", puntos daño=" + pdanyo +
                '}';
    }


}
