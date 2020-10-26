package com.agilg00;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);



        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();

            if (num%2==0){
                System.out.println("Es par");
            }else {
                System.out.println("Es impar");
            }
            if (num>0){
                System.out.println("Es positivo");
            }else if (num<0){
                System.out.println("Es negativo");
            }

            System.out.println("Su cuadrado es: "+Math.pow(num, 2));
        }while (num !=0);
    }
}
