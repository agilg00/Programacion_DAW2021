package com.agilg00;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("introduce el tamaño del array");
        t = sc.nextInt();
        int[][] numeros = new int[t][t];
        int[][] rellenoAleatorio = new int[t][t];

        for (int i = 0; i < rellenoAleatorio.length; i++) {
            for (int j = 0; j < rellenoAleatorio.length; j++) {
                rellenoAleatorio[i][j] = (int) (Math.random()*200+100);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = rellenoAleatorio[i][j];
                System.out.print(numeros[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.print("-------------------------------------------");
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = rellenoAleatorio[i][j];
                System.out.print(numeros[i][j]+" | ");
            }
            System.out.println();
        }

    }
}
