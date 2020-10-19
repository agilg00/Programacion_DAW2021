package com.agilg00;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        System.out.println("Crea un programa que pida al usuario su año de nacimiento y el año actual " +
                "(suando datos de tipo short) y halle la diferencia de ambos para obtener su edad");

        short Nacimiento;
        short Actual;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introcue tu año de nacimiento: ");
        Nacimiento = sc.nextShort();
        System.out.println("Introduce el año actual: ");
        Actual = sc.nextShort();

        System.out.println("Actualmente tienes o cumplirás "+(Actual-Nacimiento)+" años.");



    }
}
