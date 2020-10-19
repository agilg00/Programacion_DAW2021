package com.agilg00;



import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Crea un programa que pida un número entero al usuario y
         dé a una variable par el valor 1 si ese número es par o el valor 0 si no es par.
          Hazlo primero con un "if" y luego con un "operador condicional".
         */
        int caso;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 1 para resolver el ejercicio con 'IF'");
        System.out.println("Introduce 2 para resolver el ejercicio con un operador condicional");
        caso = sc.nextInt();

        switch (caso){
            case 1:
                System.out.println("Introduce un número");
                int num;
                int variable;
                num = sc.nextInt();

                if (num%2 == 0){
                    variable = 1;
                    System.out.println("El número es par");
                    System.out.println(variable);
                }else {
                    variable = 0;
                    System.out.println("El número es impar");
                    System.out.println(variable);
                }
                break;
            case 2:
                System.out.println("Introduce un número");
                int num2;

                num2 = sc.nextInt();


                String resultado = (num2%2==0) ? "Es par" : "Es impar";
                System.out.println(resultado);



        }


    }
}
