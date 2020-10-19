package com.agilg00;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule " +
                "su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km)");
        float numMilla;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca una longitud en millas: ");
        numMilla = sc.nextFloat();

        float equivalencia = (float) (numMilla*1.609);

        if (numMilla == 1){
            System.out.println(numMilla+" milla son "+equivalencia+" kilómetros");
        } else{
            System.out.println(numMilla+" millas son "+equivalencia+ " kilómetros");
        }



    }
}