package com.agilg00;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num;
        System.out.println("Introduce un número del 1 al 10 y se mostrará su tabla de multiplicar");
        do {
            num = sc.nextInt();

        }while (num<1 || num>10);

        for (int i = 0; i <=10 ; i++) {

            System.out.println(num+"x"+i+"="+i*num);

        }
    }
}
