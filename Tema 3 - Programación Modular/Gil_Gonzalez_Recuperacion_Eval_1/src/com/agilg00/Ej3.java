package com.agilg00;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long numPrincipal;
        long numPrincipalCopia;
        long numPrincipalCopia2;
        long aux;
        long numPrincipalInvertido = 0;
        int contaPos = 0;
        int pos;
        int numUsuario;

        System.out.println("Introduce el número principal: ");

        numPrincipal = sc.nextLong();

        System.out.println("Introduce la posición dentro del número: ");

        pos = sc.nextInt();

        System.out.println("Introduce el nuevo número: ");

        numUsuario = sc.nextInt();

        //Esta igualdad es para duplicar el número principal

        numPrincipalCopia = numPrincipal;
        numPrincipalCopia2 = numPrincipal;
        aux = numPrincipal;

        //Para contar las posiciones

        while (numPrincipal!=0){
            numPrincipal= numPrincipal/10;
            contaPos++;

        }

        //A partir de ahora numPrincipal vale 0, por lo que voy a trabajar con la variable duplicada.

        //Bucle para cortar el número hasta la posicion indicada.

        for (int i = 0; i < contaPos-pos+1; i++) {
            numPrincipalCopia = numPrincipalCopia/ 10;


        }

        /*Una vez cortado el número he indicado el número que queremos cambiar,
        procedemos a imprimir el resto del número, el cual debemos de invertir para sacar las posiciones
        y luego volverlo a invertir para imprimirlo.
         */

        while (aux!=0){
            numPrincipalCopia2 = aux%10;
            aux = aux/10;
            numPrincipalInvertido = numPrincipalInvertido*10 + numPrincipalCopia2;

        }
        // cortar el numero invertido

        for (int i = 0; i <contaPos - (contaPos-pos) ; i++) {

            numPrincipalInvertido = numPrincipalInvertido/10;

        }

        long numPrincipalInvertidoCopia;

        numPrincipalInvertidoCopia = numPrincipalInvertido;

        long numeroFinal = 0;

        //volver a invertir ese número


        while (numPrincipalInvertido>0){
            numPrincipalInvertidoCopia = numPrincipalInvertido%10;
            numPrincipalInvertido = numPrincipalInvertido/10;
            numeroFinal = numeroFinal*10+numPrincipalInvertidoCopia;

        }



        System.out.println("El número final es: ");

        System.out.print(numPrincipalCopia);
        System.out.print(numUsuario);
        System.out.print(numeroFinal);




    }
}
