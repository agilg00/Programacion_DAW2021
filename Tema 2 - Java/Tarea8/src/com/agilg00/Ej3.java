package com.agilg00;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        int num_usuario;

        int num_aleatorio;

        num_aleatorio = (int) (Math.random()*100);

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número, si acierta, se cierra el programa.");
        do {
            System.out.println("Introduce un número");
            num_usuario = sc.nextInt();

            if (num_usuario!=num_aleatorio && num_usuario!=-1){
                if (num_usuario > num_aleatorio){
                    System.out.println("Pista: El número es menor");
                }else {
                    System.out.println("Pista: El número es mayor");
                }
            }

        }while (num_usuario!=num_aleatorio && num_usuario!=-1);

        if (num_usuario==-1){
            System.out.println("Te rendiste");
        }else {
            System.out.println("ACERTASTE");
        }

    }
}
