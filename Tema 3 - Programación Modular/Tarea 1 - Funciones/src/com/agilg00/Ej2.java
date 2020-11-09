package com.agilg00;

import java.util.Scanner;

public class Ej2 {

    public static void Eco2(int n, int n2){

        for (int i = n; i < n2; i++) {

            System.out.println(i);

        }
    }

    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");

        num1 = sc.nextInt();
        num2 = sc.nextInt();


        Eco2(num1, num2);
    }
}
