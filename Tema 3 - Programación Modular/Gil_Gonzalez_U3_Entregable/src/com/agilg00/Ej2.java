package com.agilg00;

import java.util.Scanner;

public class Ej2 {
    public String convierteEnMorse(int n){

        String[] morse = {". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _", ". . . . .", "_ . . . .",
                "_ _ . . .", "_ _ _ . .", "_ _ _ _ .", "_ _ _ _ _"};
        String numeros = "1234567890";
        int posicion = 0;

        for (int i = 0; i < numeros.length(); i++) {
            posicion++;
        }
        return morse[posicion];

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");

        int n;
        n = sc.nextInt();





    }
}
