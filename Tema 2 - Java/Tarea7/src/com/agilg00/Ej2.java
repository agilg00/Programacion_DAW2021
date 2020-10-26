package com.agilg00;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        int edad;
        int nivel_de_estudios;
        int ingresos;

        boolean jasp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad:");
        edad = sc.nextInt();

        System.out.println("Introduce el nivel de estudios:");
        nivel_de_estudios = sc.nextInt();

        System.out.println("Introduce los ingresos: ");
        ingresos = sc.nextInt();

        if (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000){
            jasp = true;
        }else {
            jasp = false;
        }

        System.out.println("Estado de jasp: "+jasp);
    }
}
