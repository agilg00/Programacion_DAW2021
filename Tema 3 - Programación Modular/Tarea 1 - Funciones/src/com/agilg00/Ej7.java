package com.agilg00;

import java.util.Scanner;

public class Ej7 {

    public static boolean esPrimo(int num){

        // El 0, 1 y 4 no son primos
        if (num == 0 || num == 1 || num == 4) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (num % i == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número y te diré si es primo o no");

        int num;

        num = sc.nextInt();


        System.out.println(esPrimo(num));
    }
}
