package com.agilg00;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la dimensión del array bidimensional: ");

        int n;

        n = sc.nextInt();


        int[][] rellenoAleatorio = new int[n][n];
        int[][] numeros = new int[n][n];

        for (int i = 0; i < rellenoAleatorio.length; i++) {
            for (int j = 0; j < rellenoAleatorio.length; j++) {
                rellenoAleatorio[i][j] = (int) (Math.random()*200+100);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j <numeros.length; j++) {
                numeros[i][j] = rellenoAleatorio[i][j];
                System.out.print(numeros[i][j]+" | ");
            }
            System.out.println();
        }


    }
}
