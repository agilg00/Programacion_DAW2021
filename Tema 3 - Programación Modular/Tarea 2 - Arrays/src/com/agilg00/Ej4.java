package com.agilg00;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int longClave;

        System.out.println("Introduce la longitud de la clave: ");
        longClave = sc.nextInt();

        int[] clave = new int[longClave];

        String claveUFinal;
        String claveAleatFinal;

        for (int i = 0; i <clave.length ; i++) {

            clave[i] = (int) (Math.random()*5+1);

        }

        claveAleatFinal = Arrays.toString(clave);

        System.out.println("Introduce la clave para abrir la cámara: ");

        int[] claveDeUsuario = new int[longClave];

        for (int i = 0; i < claveDeUsuario.length; i++) {

            claveDeUsuario[i] = sc.nextInt();

            if (claveDeUsuario[i]<clave[i]){
                System.out.println(claveDeUsuario[i]+" es menor");
            }
            if (claveDeUsuario[i]>clave[i]){
                System.out.println(claveDeUsuario[i]+" es mayor");
            }
        }

        System.out.println(Arrays.toString(claveDeUsuario));

        claveUFinal = Arrays.toString(claveDeUsuario);

        while (!claveAleatFinal.equals(claveUFinal)){
            System.out.println("CLAVE INCORRECTA, PRUEBE OTRA VEZ");

            for (int i = 0; i < claveDeUsuario.length; i++) {

                claveDeUsuario[i] = sc.nextInt();

                if (claveDeUsuario[i]<clave[i]){
                    System.out.println(claveDeUsuario[i]+" es menor");
                }
                if (claveDeUsuario[i]>clave[i]){
                    System.out.println(claveDeUsuario[i]+" es mayor");
                }


            }


            System.out.println(Arrays.toString(claveDeUsuario));

            claveUFinal = Arrays.toString(claveDeUsuario);

        }

        System.out.println("ABRIENDO LA PUERTA DE LA CÁMARA");


    }
}
