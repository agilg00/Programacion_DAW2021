package com.agilg00;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num ;



        System.out.println("Introduce un número:");
        
        num = sc.nextInt();
        
        int numero_aux = 0;


       

        for (int i = 0; i < num; i++) {

            numero_aux = numero_aux*10 + i;
            
        }



        for (int i = 1; i <=num; i++) {
            for (int j = 0; j <(num*2)-1; j++) {

                if (i+j>=num || (j*2)-1 <=0){

                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }


            }
            System.out.println();
            
        }
    }
}
