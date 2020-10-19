package com.agilg00;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {


        System.out.println("Crea un programa que pida un número entero al usuario y diga" +
                " si es positivo (mayor que cero) o si, por el contrario, no lo es (usando \"else\")");


        int num;
        Scanner sc = new Scanner(System.in);




        do {
            System.out.println("Por favor, introduce un número positivo: ");
            num = sc.nextInt();
            if (num>0){
                System.out.println("El número es correcto");
            }else{
                System.out.println("Número incorrecto.");
            }

        }while (num<1);

    }
}
