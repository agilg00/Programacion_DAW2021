package com.agilg00;

public class Banco {
    private String nombre;
    private int capital;
    private String direccion;

    public void Agregarbanco(String nombre, int capital, String direccion) {
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public String nombreBanco(){
        return this.nombre;
    }


    public String mostrarInfo() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", capital=" + capital +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
