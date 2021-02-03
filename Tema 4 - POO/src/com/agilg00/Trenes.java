package com.agilg00;

import java.util.Arrays;

public class Trenes {

    Maquinista m1;
    Locomotoras l1;
    Vagones vagones;


    public Trenes(Maquinista m1, Locomotoras l1, Vagones vagones) {
        this.m1 = m1;
        this.l1 = l1;
        this.vagones = vagones;
    }


    public String mostrarTren() {
        return "Tren= " + "maquinista= " + m1 + ", locomotora= " + l1 + ", vagones=" + vagones;
    }
}
