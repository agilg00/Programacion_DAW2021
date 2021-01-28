package com.agilg00;

public class Hora12 {
    private int hora;
    private int minutos;

    public Hora12(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public void inc(){

        minutos = minutos+1;

        if (hora>12){
            hora = 1;
        }
        if (hora ==0){
            hora = 12;
        }

        if (minutos>59){
            minutos = 0;
        }

        if (hora == 12 && minutos ==0 ){
            hora = 1;
        }

    }

    public void setHora12(int hora) {


        if (hora>12){
            this.hora = (hora - 12) ;
        } else {
            this.hora = hora;
        }

    }

    public void setMinutos12(int minutos) {

        if (minutos>59){
            this.minutos = (minutos - 60) ;
        } else {
            this.minutos = minutos;
        }

    }








}
