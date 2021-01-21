package com.agilg00;

import java.util.Arrays;

public class Escenario {

    private int altura;
    private int longitud;
    private int numAnillos;
    private int numGemas;
    private TipoEnemigo[] tipoEnemigos;
    private Enemigo[] enemigos;


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getNumAnillos() {
        return numAnillos;
    }

    public void setNumAnillos(int numAnillos) {
        this.numAnillos = numAnillos;
    }

    public int getNumGemas() {
        return numGemas;
    }

    public void setNumGemas(int numGemas) {
        this.numGemas = numGemas;
    }

    public TipoEnemigo[] getTipoEnemigos() {
        return tipoEnemigos;
    }

    public void setTipoEnemigos(TipoEnemigo[] tipoEnemigos) {
        this.tipoEnemigos = tipoEnemigos;
    }

    public Enemigo[] getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(Enemigo[] enemigos) {
        this.enemigos = enemigos;
    }

    @Override
    public String toString() {
        return "Escenario{" +
                "altura=" + altura +
                ", longitud=" + longitud +
                ", numAnillos=" + numAnillos +
                ", numGemas=" + numGemas +
                ", tipoEnemigos=" + Arrays.toString(tipoEnemigos) +
                ", enemigos=" + Arrays.toString(enemigos) +
                '}';
    }
}
