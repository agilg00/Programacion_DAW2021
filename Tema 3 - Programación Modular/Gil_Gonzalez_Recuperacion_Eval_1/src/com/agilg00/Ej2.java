package com.agilg00;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {


        int alto;
        int ancho;



        char pez = '&';

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el alto de la pecera: ");

        alto = sc.nextInt();

        System.out.println("Introduce el ancho de la pecera: ");

        ancho = sc.nextInt();

        int posPezY = (int) (Math.random()*alto);
        int posPezX = (int) (Math.random()*ancho);

        for (int i = 0; i <alto ; i++) {
            for (int j = 0; j <ancho; j++) {

                if (i==0 || i== alto-1 || j==0 || j== ancho-1 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

                if (i == posPezX && j == posPezY){
                    System.out.print(pez);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
