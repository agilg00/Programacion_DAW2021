package com.agilg00;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int casos;
        double radio;
        double radio2;
        double radio3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("Menú principal");
        System.out.println("1.Calcular diámetro");
        System.out.println("                   ");
        System.out.println("2.Calcular perímetro");
        System.out.println("                   ");
        System.out.println("3.Calcular área");
        System.out.println("                   ");
        System.out.println("Introduce el número para realizar la operación");
        casos = sc.nextInt();

        switch (casos){
            case 1:

                System.out.println("Introduce el radio de la circunferencia en centímetros");
                radio = sc.nextDouble();
                System.out.println("Calculando diámetro...");
                System.out.println("El diámetro de la circunferencia será de "+(radio*2)+" centímetros");
                break;
            case 2:
                System.out.println("Introduce el radio de la circunferencia en centímetros");
                radio2 = sc.nextDouble();
                System.out.println("Calculando el perímetro...");
                System.out.println("El perímetro de la circunferencia será de "+(2*Math.PI*radio2)+" centímetros");
                break;
            case 3:
                System.out.println("Introduce el radio de la circunferencia en centímetros");
                radio3 = sc.nextDouble();
                System.out.println("Calculando el área...");
                System.out.println("El área de la circunferencia será de "+(Math.PI*Math.pow(radio3,2))+" centímetros");
                break;



        }
    }
}

