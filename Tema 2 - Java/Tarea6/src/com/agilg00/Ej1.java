package com.agilg00;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        System.out.println("Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes. " +
                "Por ejemplo, si el usuario introduce 9, deberá escribir 'septiembre'");

        int mes;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número del mes:");
        mes = sc.nextInt();

        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiempre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
        }
    }
}