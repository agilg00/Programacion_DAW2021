package com.agilg00;



public class Personaje {


    private String personaje;
    private double velocidad;
    private int dPunch;
    private int dPatada;

    public Personaje(String personaje, double velocidad, int dPunch, int dPatada) {
        this.personaje = personaje;
        this.velocidad = velocidad;
        this.dPunch = dPunch;
        this.dPatada = dPatada;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getdPunch() {
        return dPunch;
    }

    public void setdPunch(int dPunch) {
        this.dPunch = dPunch;
    }

    public int getdPatada() {
        return dPatada;
    }

    public void setdPatada(int dPatada) {
        this.dPatada = dPatada;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "personaje='" + personaje + '\'' +
                ", velocidad=" + velocidad +
                ", dPunch=" + dPunch +
                ", dPatada=" + dPatada +
                '}';
    }
}
