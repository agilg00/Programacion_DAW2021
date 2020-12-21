package com.agilg00;

import java.util.Arrays;

public class Texto {

    /*
    Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:

-La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.

-Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.

-Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.

-Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.

     */

    String texto;
    CharSequence[] vocales = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
    long longitud;
    char caracter;
    String cadena;

    public void Escribir(String texto){
        this.texto = texto;
    }

    public void contarVocales(String text){
        int numVocales = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.contains(Arrays.toString(vocales))){
                numVocales++;

            }

        }
        System.out.println(numVocales);

    }


}
