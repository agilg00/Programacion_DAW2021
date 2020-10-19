package com.agilg00;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que calcule y muestre" +
                " la división de dos números reales de doble precisión introducidos por el usuario");


        float num1;
        float num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        num1 = sc.nextFloat();
        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextFloat();

        System.out.println("La division entre "+num1+" y "+num2+" es de "+(num1/num2));
    }
}
