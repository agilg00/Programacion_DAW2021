package com.agilg00;

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
        System.out.println("Sería interesante disponer de un programa que pida como entrada un" +
                " número decimal y lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5");


        double num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número a redondear");
        num = sc.nextDouble();

        System.out.println(Math.round(num));



    }
}