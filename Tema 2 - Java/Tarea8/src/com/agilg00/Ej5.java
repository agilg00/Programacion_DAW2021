package com.agilg00;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        /*Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
        A continuación, solicitará por teclado un valor que debe estar dentro del rango.
        Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango
         */

        int rango_max;
        int rango_min;
        int valor_usuario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor mínimo de un rango: ");
        rango_min = sc.nextInt();

        System.out.println("Introduce el valor máximo de un rango: ");
        rango_max = sc.nextInt();

        System.out.println("Introduce un valor dentro del rango "+rango_min+ " - "+rango_max);
        do {
            valor_usuario = sc.nextInt();

            while (valor_usuario>rango_max || valor_usuario < rango_min){
                System.out.println("Error, el valor está fuera de rango.");
                valor_usuario = sc.nextInt();
            }


        }while (valor_usuario>rango_max || valor_usuario < rango_min);
    }
}
