package com.agilg00;

import java.util.Scanner;

public class Ej6 {
    public static void esVocal(String parametro){
        String a = "a";
        String e = "e";
        String i = "i";
        String o = "o";
        String u = "u";

        boolean vocal;

        if (parametro.contains(a) || parametro.contains(e) || parametro.contains(i) || parametro.contains(o) || parametro.contains(u) ){
            vocal = true;

        }else {
            vocal= false;
        }

        System.out.println(vocal);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un carácter y te diré si es una vocal");

        String caracter;

        caracter = sc.next();

        esVocal(caracter);
    }
}
