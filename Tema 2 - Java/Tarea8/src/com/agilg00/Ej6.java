package com.agilg00;

public class Ej6 {

    public static void main(String[] args) {


        /*
        Escribir todos los múltiplos de 7 menores que 100.
         */


        System.out.println("Los multiplos de 7 menores de 100 son:");

        int multiplo = 7;


        for (int i = 1; i <100 ; i++) {

            if (multiplo*i<100){
                System.out.println(multiplo*i);
            }

        }

    }
}
