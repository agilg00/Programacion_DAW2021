package com.agilg00;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums;



        System.out.println("Introduce el número de números");
        nums = sc.nextInt();

        int[] numeros = new int[nums];
        System.out.println("Introduce los números");

        for (int i = 0; i <numeros.length ; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length ; i--) {

            System.out.println(numeros[i]);

        }
    }
}
