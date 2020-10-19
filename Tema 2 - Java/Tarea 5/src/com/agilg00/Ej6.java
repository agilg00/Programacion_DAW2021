package com.agilg00;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        System.out.println("Crea un programa que contenga una constante llamada gravedad=9,8," +
                " solicite al usuario el valor de \"tiempo\", y calcule y muestre la velocidad " +
                "(velocidad=gravedad x tiempo). " +
                "Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje \"Tiempo incorrecto\"");

        double gravedad = 9.8;

        double tiempo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Puedo calcular la velocidad. Pero primero necesito que introduzca el tiempo en segundos: ");
        tiempo = sc.nextDouble();


        System.out.println("Calculando velocidad!");
        System.out.println("La velocidad es de "+(gravedad*tiempo)+" metros por segundo.");


    }
}
