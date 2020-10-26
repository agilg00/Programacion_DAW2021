package com.agilg00;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        String m_inicio = "Javalín, Javalón";
        String m_final = "Javalén, len, len";
        String frase_usuario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        frase_usuario = sc.nextLine();

        String frase1 = m_inicio+"           viva el cadi";
        String frase2 = "jerez porqueria          "+m_final;


        if (frase_usuario.contains(m_inicio)){
            System.out.println("La frase está en el idioma javalandia");
        }else {
            System.out.println("No está en idioma javalandia");
        }
    }
}
