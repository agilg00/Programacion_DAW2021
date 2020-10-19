package com.agilg00;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que diga si el número introducido por el usuario es impar o no lo es");


        int num;
        Scanner sc = new Scanner(System.in);



        do {
            System.out.println("Por favor, introduce un número par:");
            num = sc.nextInt();
            if (num%2==0){
                System.out.println("El número es par!");

            }else{
                System.out.println("El número es impar!");
            }

        }while (num%2!=0);


    }
}
