package com.agilg00;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que pida tres números enteros" +
                " largos al usuario y diga cuál es el mayor de los tres");


        long num1;
        long num2;
        long num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduce 3 números:");
        System.out.println("Primer número: ");
        num1 = sc.nextLong();
        System.out.println("Segundo número: ");
        num2 = sc.nextLong();
        System.out.println("Tercer número: ");
        num3 = sc.nextLong();


        if (num1>num2 && num1>num3){
            System.out.println("El número "+num1+" es el mayor de los 3");
        }
        if (num2>num1 && num2>num3){
            System.out.println("El número "+num2+" es el mayor de los 3");
        }
        if (num3>num2 && num3>num1){
            System.out.println("El número "+num3+" es el mayor de los 3");
        }
    }
}
