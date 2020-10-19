package com.agilg00;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        System.out.println(" Crea un programa que pida al usuario que introduzca el número 12." +
                " Después debe decirle si lo ha hecho correctamente o no");

        int num = 12;
        int numUsuario;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Por favor, introduzca el número 12");
            numUsuario = sc.nextInt();

            if (num==numUsuario){
                System.out.println("Correcto!");
            }else{
                System.out.println("Incorrecto!");
            }

        }while (num!=numUsuario);



    }
}
