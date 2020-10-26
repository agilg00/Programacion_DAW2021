package com.agilg00;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
         Se introducirán las edades de los elumnos hasta que una de ellas sea negativa.
         La aplicación mostrará la suma de las edades, la media, de cuántos alumnos hemos introducido su edad,
          y cuántos alumnos son mayores de edad.
         */

        int edad;
        int contador = 0;


        int suma = 0;

        int mayor_de_edad=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce las edades de los alumnos: ");
            edad = sc.nextInt();


            if (edad>0){
                contador++;
                suma = suma+edad;
            }

            if (edad>18){
                mayor_de_edad++;
            }

        }while (edad>0);

        System.out.println(suma);

        int media;

        media = suma/(contador);

        System.out.println("Número de alumnos: "+(contador));

        System.out.println("Media de edad: "+media);
        System.out.println("Alumnos mayores de edad: "+mayor_de_edad);

    }
}
