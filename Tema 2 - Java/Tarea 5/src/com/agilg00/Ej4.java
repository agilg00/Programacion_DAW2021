package com.agilg00;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que pida al usuario dos " +
                "números enteros y cuántos de ellos son pares");


        int num;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduce un número: ");
        num = sc.nextInt();
        System.out.println("Por favor, introduce otro número: ");
        num2 = sc.nextInt();
        if (num%2==0){
            System.out.println("El número "+num+" es par!");

        }else{
            System.out.println("El número "+num+" es impar!");
        }
        if (num2%2==0){
            System.out.println("El número "+num2+" es par!");

        }else{
            System.out.println("El número "+num2+" es impar!");
        }
    }
}
