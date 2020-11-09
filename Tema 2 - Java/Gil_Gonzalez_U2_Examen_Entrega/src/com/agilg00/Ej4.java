package com.agilg00;

public class Ej4 {

    public static void main(String[] args) {

        String[] notas = {" do ", " re ", " mi ", " fa ", " sol ", " la ", " si "};

        for (int i = 0; i < 4; i++) {
            System.out.print(notas[(int) (Math.random()*7)]);

        }
        System.out.print("|");
        for (int i = 0; i < 4; i++) {
            System.out.print(notas[(int) (Math.random()*7)]);

        }
        System.out.print("|");
        for (int i = 0; i < 4; i++) {
            System.out.print(notas[(int) (Math.random()*7)]);

        }
        System.out.print("|");
        for (int i = 0; i < 4; i++) {
            System.out.print(notas[(int) (Math.random()*7)]);

        }
        System.out.print("|");


    }
}
