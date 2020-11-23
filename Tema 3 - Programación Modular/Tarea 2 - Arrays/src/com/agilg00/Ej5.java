package com.agilg00;

import java.util.Scanner;

public class Ej5 {

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
