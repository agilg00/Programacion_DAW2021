package com.agilg00;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        // Pedir un número y calcular su factorial

        Scanner sc = new Scanner(System.in);

        int num;
        int factorial = 1;
        int aux;

        System.out.println("Introduce un número para calcular su factorial: ");
        num = sc.nextInt();
        aux = num;

        while ( num!=0) {
            factorial=factorial*num;
            num--;
         }


        System.out.println("El factorial de "+aux+" es: "+factorial);

    }
}
