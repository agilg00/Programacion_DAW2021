package com.agilg00;

import java.util.Scanner;

public class Ej4 {

    public static void esMayor(int num1, int num2){
        if (num1>num2){
            System.out.println("El mayor es: "+num1);
        }else {
            System.out.println("El mayor es: "+num2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Introduce 2 números, y te diré cuál es mayor");
        num1 = sc.nextInt();
        num2 = sc.nextInt();


        esMayor(num1,num2);
    }
}
