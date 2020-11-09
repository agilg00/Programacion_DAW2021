package com.agilg00;



public class Ej2 {
    public static void main(String[] args) {


        int carct_random = (int) (Math.random()*40);

        String[] caracteres_aleatorios = {"*", "-", "=", ".", "|", "@"};

        for (int i = 1; i <carct_random ; i++) {
            for (int j = 0; j < carct_random; j++) {
                System.out.print(caracteres_aleatorios[(int) (Math.random()*6)]);

            }
            System.out.println();

        }


    }
}
