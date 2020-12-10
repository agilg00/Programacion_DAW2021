package com.agilg00;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

    public static int[] mezcla(int[] a, int[] b){
        /*
        Esta función toma dos vectores como parámetros y devuelve un array
        que es el resultado de mezclar los números de ambos de forma alterna,
        se coge un número de a, luego de b, luego de a, etc. Los vectores y b
         pueden tener longitudes diferentes; por tanto, si se terminan los números
         de un array se terminan de coger todos los que quedan del otro.
         */
        int[] resultado = new int[a.length];
        int[] resultado2 = new int[b.length];
        int[] suma = new int[a.length+ b.length];


        int valoresa = 0;
        int valoresb = 0;

        for (int i = 0; i < a.length ; i++) {
            valoresa = valoresa*10+i;
            resultado[i] = valoresa;

        }
        for (int j = 0; j < b.length ; j++) {
            valoresb = valoresb*10+j;
            resultado2[j] = valoresb;
        }




        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("¿Cuántos valores quieres en el vector A?");
        a = sc.nextInt();
        System.out.println("¿Cuántos valores quieres en el vector B?");
        b = sc.nextInt();
        if (a>=0 || b>=0){
            System.out.println("Introduce "+a+" valores para el array A y "+b+" valores para el vector B: ");
        }

        int [] vectorA = new int[a];
        int [] vectorB = new int[b];

        System.out.println("Vector A: ");
        for (int i = 0; i <vectorA.length ; i++) {
            vectorA[i] = sc.nextInt();
        }
        System.out.println("Vector B: ");
        for (int i = 0; i <vectorB.length ; i++) {
            vectorB[i] = sc.nextInt();
        }



        System.out.println(Arrays.toString(mezcla(vectorA, vectorB)));


    }
}
