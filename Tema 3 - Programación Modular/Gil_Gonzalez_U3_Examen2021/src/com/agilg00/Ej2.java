package com.agilg00;


import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        /*Está hecho a lo bruto*/

        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[4][5];
        int[][] relleno = new int[4][5];
        int sumafila = 0;
        int sumafila1 = 0;
        int sumafila2 = 0;
        int sumafila3 = 0;
        int sumacolumna = 0;
        int sumacolumna1 = 0;
        int sumacolumna2 = 0;
        int sumacolumna3 = 0;
        int sumacolumna4 = 0;

        System.out.println("Introduce 20 valores");

        for (int i = 0; i < relleno.length; i++) {
            for (int j = 0; j <= relleno.length; j++) {
                relleno[i][j] = sc.nextInt();
                if (i==0){
                    sumafila = sumafila+relleno[i][j];
                }
                if (i==1){
                    sumafila1 = sumafila1+relleno[i][j];
                }
                if (i==2){
                    sumafila2 = sumafila2+relleno[i][j];
                }
                if (i==3){
                    sumafila3 = sumafila3+relleno[i][j];
                }
                if (j==0){
                    sumacolumna = sumacolumna+relleno[i][j];
                }if (j==1){
                    sumacolumna1 = sumacolumna1+relleno[i][j];
                }if (j==2){
                    sumacolumna2 = sumacolumna1+relleno[i][j];
                }if (j==3){
                    sumacolumna3 = sumacolumna1+relleno[i][j];
                }if (j==4){
                    sumacolumna4 = sumacolumna1+relleno[i][j];
                }
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j <= tabla.length; j++) {
                tabla[i][j] = relleno[i][j];
                System.out.print(tabla[i][j] + " | ");

            }
            System.out.println();
        }
        System.out.println("Suma fila 1: " +sumafila);
        System.out.println("Suma fila 2: " +sumafila1);
        System.out.println("Suma fila 3: " +sumafila2);
        System.out.println("Suma fila 4: " +sumafila3);
        System.out.println("Suma columna 1: "+sumacolumna);
        System.out.println("Suma columna 2: "+sumacolumna1);
        System.out.println("Suma columna 3: "+sumacolumna2);
        System.out.println("Suma columna 4: "+sumacolumna3);
        System.out.println("Suma columna 5: "+sumacolumna4);
        System.out.println("Suma total : "+ (sumafila+sumafila1+sumafila2+
                sumafila3+sumacolumna+sumacolumna1+sumacolumna2+
                sumacolumna3+sumacolumna4));

    }
}
