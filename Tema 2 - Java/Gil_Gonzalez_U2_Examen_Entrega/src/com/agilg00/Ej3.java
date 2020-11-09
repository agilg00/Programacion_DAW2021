package com.agilg00;

import java.util.Scanner;

public class Ej3 {

    /*
    Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando
los dígitos de la siguiente manera: primer dígito del primer número, primer
dígito del segundo número, segundo dígito del primer número, segundo
dígito del segundo número, tercer dígito del primer número… Para facilitar
el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
long en lugar de int donde sea necesario para admitir números largos.

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, espar = 0, espar2=0;
        int num2, esimpar=0, esimpar2=0;
        int cont_posicion1=0;
        int cont_posicion2=0;

        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();


        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();


        while (num1!=0){
            num1=num1/10;
            cont_posicion1++;

        }

        while (num2!=0){
            num2=num2/10;
            cont_posicion2++;

        }



        for (int i = 0; i < cont_posicion1-1; i++) {
            if(i%2==0){
                espar=espar*10+i;
            }else {
                esimpar=esimpar*10+i;
            }

        }
        for (int i = 0; i < cont_posicion2-1; i++) {
            if(i%2==0){
                espar2=espar2*10+i;
            }else {
                esimpar2=esimpar2*10+i;
            }

        }


        System.out.println("El numero formado por pares es: "+espar+""+espar2);
        System.out.println("El numero formado por impares es: "+esimpar+""+esimpar2);










    }
}
