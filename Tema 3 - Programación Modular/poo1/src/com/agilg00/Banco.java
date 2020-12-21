package com.agilg00;

public class Banco {


    protected static String nombredelBanco;

    long capital;
    String direccion_central;

    public void nombreBanco(String nombre){
        nombredelBanco = nombre;
    }
    public void infoBanco(String nombre, long capital, String direccion_central){
        nombredelBanco = nombre;
        this.capital = capital;
        this.direccion_central = direccion_central;
    }

}

