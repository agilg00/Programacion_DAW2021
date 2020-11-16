package com.agilg00;

import java.util.Scanner;

public class Ej5 {

    public static void esMayor2(int num1, int num2, int num3){

        System.out.println("El mayor es: "+Math.max(num1, Math.max(num2, num3)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Introduce 3 números y te diré cuál es el mayor: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();


        esMayor2(num1, num2, num3);


    }
}
