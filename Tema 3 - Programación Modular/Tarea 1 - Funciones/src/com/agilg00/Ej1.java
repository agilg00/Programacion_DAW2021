package com.agilg00;

import java.util.Scanner;

public class Ej1 {
    public static void eco(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(n);
        }


    }

    public static void main(String[] args) {


        System.out.println("Introduce un número y se mostrará n veces por pantalla");
        Scanner sc = new Scanner(System.in);

        int numero;

        numero = sc.nextInt();


        eco(numero);
    }


}
