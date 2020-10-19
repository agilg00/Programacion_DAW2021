package com.agilg00;

import java.util.Calendar;

public class Ej5 {

    public static void main(String[] args) {
        Calendar Calendario = Calendar.getInstance();

        int hora;
        int minutos;
        int segundos;

        hora = Calendario.get(Calendar.HOUR_OF_DAY);
        minutos = Calendario.get(Calendar.MINUTE);
        segundos = Calendario.get(Calendar.SECOND);

        System.out.println(hora+":"+minutos+":"+segundos);






    }
}