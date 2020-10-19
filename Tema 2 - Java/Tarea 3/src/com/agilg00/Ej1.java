package com.agilg00;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que calcule y muestre la suma de dos números" +
                " de dos cifras (de tipo byte) que introduzca el usuario");


        byte num1;
        byte num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número a sumar: ");
        num1 = sc.nextByte();
        System.out.println("Introduce el segundo número a sumar: ");
        num2 = sc.nextByte();

        System.out.println("La suma de "+num1+" y "+num2+" es "+(num1+num2));
    }

}
