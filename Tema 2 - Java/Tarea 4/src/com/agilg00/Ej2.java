package com.agilg00;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        System.out.println("Necesitamos una aplicación que calcule la media aritmética" +
                " de dos notas enteras. Hay que tener en cuenta que la media puede contener decimales");

        double nota1;
        double nota2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        nota2 = sc.nextDouble();


        double media = (nota1+nota2)/2;


        System.out.println("La media de las notas es de "+media);
    }
}