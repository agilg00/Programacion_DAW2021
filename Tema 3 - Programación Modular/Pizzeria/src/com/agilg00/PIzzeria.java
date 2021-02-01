package com.agilg00;

public class PIzzeria {

    private Pizza[] pedidos;
    private int indice_pedidos;
    private int tam_max;

    public int getIndice_pedidos() {
        return indice_pedidos;
    }

    public void setIndice_pedidos(int indice_pedidos) {
        this.indice_pedidos = indice_pedidos;
    }

    public int getTam_max() {
        return tam_max;
    }

    public void setTam_max(int tam_max) {
        this.tam_max = tam_max;
    }

    public PIzzeria() {
        setIndice_pedidos(0);
        setTam_max(5);

    }







}
