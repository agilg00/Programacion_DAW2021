package com.agilg00;

public class InterfazFM {

    double frecuencia;
    double frecuenciaMin = 80;
    double frecuenciaMax = 108;

    void Sintonizar (double newFrecuencia){
        this.frecuencia = newFrecuencia;
        if (this.frecuencia>this.frecuenciaMax){
            this.frecuencia = this.frecuenciaMin;
        }
        if (this.frecuencia < this.frecuenciaMin){
            this.frecuencia = this.frecuenciaMax;
        }

    }

    void up(){
        this.frecuencia = this.frecuencia + 0.5;

        if (this.frecuencia>this.frecuenciaMax){
            this.frecuencia = this.frecuenciaMin;
        }

    }
    void down(){

        this.frecuencia = this.frecuencia - 0.5;
        if (this.frecuencia < this.frecuenciaMin){
            this.frecuencia = this.frecuenciaMax;
        }
    }


    public String mostrarFrecuencia() {
        return "InterfazFM{" +
                "frecuencia=" + frecuencia +
                '}';
    }



}
