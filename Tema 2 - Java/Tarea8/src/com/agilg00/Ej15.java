package com.agilg00;

import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ;
        System.out.println("Introduce un numero");
        num = sc.nextInt();

        int contador_Primos=0;

        for (int i = 1; i <=num; i++) {
            boolean esprimo = true;

            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    esprimo = false;
                    break;


                }
            }
            System.out.println(i);
            if (esprimo){
                contador_Primos++;
            }
        }

        System.out.println("Entre 1 y "+num+ " hay "+contador_Primos+" números primos");
    }
}
