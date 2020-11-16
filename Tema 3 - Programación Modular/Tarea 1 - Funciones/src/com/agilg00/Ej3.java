package com.agilg00;

import java.util.Scanner;

public class Ej3 {

    public static void Area_Volumen(int caso, int radio_base, int altura){

        Scanner sc = new Scanner(System.in);
        double areat;
        double volt;

        if (caso==0){
            areat = (2*Math.PI*radio_base*(altura+radio_base));

            System.out.println("El área total es: "+areat+" metros cuadrados");

        }else {
            volt = Math.PI * Math.pow(radio_base,2)*altura;

            System.out.println("El volumen es de: "+volt+" metros cúbicos");
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int radio;
        int altura;
        int caso;

        System.out.println("Se calculará el área o el volumen de un cilindro.");
        System.out.println("Especifique el radio de la base: ");
        radio = sc.nextInt();
        System.out.println("Introduce la altura: ");
        altura = sc.nextInt();

        System.out.println("Introduce el caso 0, si se quiere calcular el área o 1 si se quiere calcular el volumen: ");
        caso = sc.nextInt();



        Area_Volumen(caso, radio, altura);



    }


}
