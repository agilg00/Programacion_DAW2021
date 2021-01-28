package com.agilg00;

public class Hora {

    private int hora;
    private int minutos;

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public void inc(){

        minutos = minutos+1;

        if (hora>23){
            hora = 0;
        }

        if (minutos>59){
            minutos = 0;
        }

        if (hora == 23 && minutos ==0 ){
            hora = 0;
        }

    }

    public void setHora(int hora) {


            if (hora>23){
                this.hora = (hora - 24) ;
            } else {
                this.hora = hora;
            }

    }

    public void setMinutos(int minutos) {

            if (minutos>59){
                this.minutos = (minutos - 60) ;
            } else {
                this.minutos = minutos;
            }

    }

    @Override
    public String toString() {
        return  hora + " : " + minutos;
    }
}
