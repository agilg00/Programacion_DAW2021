package com.agilg00;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

    public static String convierteArrayEnString(int[] a){


        int conjuntonum = 0;
        String cadenaFinal = conjuntonum+"";
        for (int i = 0; i < a.length; i++) {
            conjuntonum = conjuntonum*10 + a[i];
            cadenaFinal = Integer.toString(conjuntonum);

        }

        return cadenaFinal;
    }

    public static void main(String[] args) {


        int n ;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos valores quieres en el array?");
        n = sc.nextInt();
        if (n>0){
            System.out.println("Introduce "+n+" valores para el array: ");
        }

        int[] array = new int[n];

        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(convierteArrayEnString(array));

    }


}
