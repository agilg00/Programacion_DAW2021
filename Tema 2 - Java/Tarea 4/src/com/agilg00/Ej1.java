package com.agilg00;


import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        System.out.println("El tipo short permite almacenar valores comprendidos entre -32768 y 32767. " +
                "Realiza un programa que muestre si el rango de valores de un tipo se comporta de forma cíclica." +
                "Es decir, que muestre el valor máximo de una" +
                " variable de tipo short, y muestre también qué ocurre si sumamos 1 a esa variable");

        short numMAX;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero maximo: ");
        numMAX = sc.nextShort();

        System.out.println(numMAX+ " si le sumamos 1:");

        System.out.println(numMAX+1);


    }
}