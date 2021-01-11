package com.agilg00;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {

            array1[i] = sc.nextInt();

        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {

                if (i==0 && j==0){
                    System.out.print("índice  0| 1| 2| 3| 4| 5| 6| 7| 8| 9|");
                }else {
                    System.out.print("");
                }

                if (i==1 && j==0){
                    System.out.print("valor  " + Arrays.toString(array1));
                }else {
                    System.out.print("");
                }

            }
            System.out.println();

        }
    }


}
