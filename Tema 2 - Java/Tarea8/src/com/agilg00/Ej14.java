package com.agilg00;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        int altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del triángulo");
        altura = sc.nextInt();

        for (int i = 0; i <=altura ; i++) {
            for (int j = 0; j <= altura; j++) {
                if (i+j >=altura ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}
