package com.agilg00;

public class Ej3 {
    public static void main(String[] args) {

        String palabra = "";

        int caracteres = (int)(Math.random()*20)+2;

        for (int i=0; i<caracteres; i++){

            int codigoAscii = (int)Math.floor(Math.random()*(122 -
                    97)+97);

            palabra = palabra + (char)codigoAscii;
        }
        System.out.println(palabra);
    }
}

