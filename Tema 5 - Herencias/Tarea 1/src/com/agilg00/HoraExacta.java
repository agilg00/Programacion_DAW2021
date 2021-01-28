package com.agilg00;

public class HoraExacta extends Hora{

    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
    }

    public void setSegundos(int segundos) {

        if (segundos>59){
            this.segundos = (segundos - 60) ;
        } else {
            this.segundos = segundos;
        }

    }

    public void inc(){
        segundos = segundos+1;
        if (segundos > 59){
            segundos = 0;
        }
    }

    @Override
    public String toString() {
        return " : " + segundos;
    }
}
