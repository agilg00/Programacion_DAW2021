package com.agilg00;

public class Ej3 {
    public static void main(String[] args) {

        int[][] numeros = new int[5][5];
        int[][] rellenoAleatorio = new int[5][5];

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
