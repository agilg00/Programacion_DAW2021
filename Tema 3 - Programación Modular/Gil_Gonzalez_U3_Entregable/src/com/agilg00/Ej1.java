package com.agilg00;

import java.util.Scanner;

public class Ej1 {

    public static int[] filtraPrimo(int cantidad, int[] nums){
        int contador = 2;
        int contadorprimos = 0;

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[cantidad];
        int[] primos = new int[contadorprimos];
        boolean primo=true;
        for (int i = 0; i < numeros[i]; i++) {
            numeros[i] = sc.nextInt();
            while ((primo) && (contador!=numeros[i])){
                if (numeros[i] % contador == 0)
                    primo = false;
                contador++;
            }

            if (primo = true){
                contadorprimos++;
            }

        }
        for (int i = 0; i < primos.length; i++) {

            primos[i] = numeros[i];
        }


        
       
        return primos;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qué tamaño tendrá el array?");
        int tamanio;

        tamanio = sc.nextInt();
        int[] arrayNumeros = new int[tamanio];

        System.out.println("Introduce los valores del array");

        for (int i = 0; i < arrayNumeros.length ; i++) {
            arrayNumeros[i] = sc.nextInt();

        }

        filtraPrimo(tamanio, arrayNumeros);









    }
}



