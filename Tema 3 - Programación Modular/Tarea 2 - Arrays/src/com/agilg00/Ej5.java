package com.agilg00;

import java.util.Scanner;

public class Ej5 {

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] enteros = new int[6];

        System.out.println("Intruce 6 numeros enteros: ");

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = sc.nextInt();
        }

        for (int i = 0; i< enteros.length ; i--) {

            System.out.println(enteros[i]);

        }


    }
}
