package com.agilg00;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int positivos =0;
        int positivos1 =0;
        int mediaPositivo;
        int mediaNegativo;
        int negativos = 0;
        int negativos1 = 0;
        int ceros = 0;

        System.out.println("Indica cuántos numeros quieres: ");

        n = sc.nextInt();


        int[] numeros = new int[n];

        System.out.println("Introduce la cantidad de números indicada: ");

        int x;

        for (x = 0; x <numeros.length ; x++) {
            numeros[x] = sc.nextInt();


            if (numeros[x]<0){
                negativos = negativos+numeros[x];
                negativos1++;


            }
            if (numeros[x]>0){
                positivos = positivos+numeros[x];
                positivos1++;
            }
            if (numeros[x]==0){
                ceros++;
            }
        }


        if (positivos1>0){
            System.out.println("Media de números positivos: ");

            mediaPositivo = positivos/positivos1;
            System.out.println(mediaPositivo);
        }
        if (negativos1>0){
            System.out.println("Media de números negativos: ");

            mediaNegativo = negativos/negativos1;
            System.out.println(mediaNegativo);
        }

        System.out.println("Número de ceros: ");
        System.out.println(ceros);
    }
}
