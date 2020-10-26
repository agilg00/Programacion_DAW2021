package com.agilg00;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        int a;
        int b;
        int aux;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de 'a'");
        a = sc.nextInt();

        System.out.println("Introduce el valor de 'b'");
        b = sc.nextInt();

        System.out.println("Valores iniciales: A= "+a+ " B= "+b);

        aux = a;
        a = b;
        b = aux;

        System.out.println("Valores intercambiados: A= "+a+" B= "+b);


    }
}
