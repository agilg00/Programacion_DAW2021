package com.agilg00;

public class CuentaCorriente {

    private int saldo;
    private int limite_Descubierto;
    private String nombre;
    private String DNI;
    private Banco Banco;


    public void CrearCuenta(String nombre, String DNI, Banco banco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.Banco = banco;
        this.saldo = 0;
        this.limite_Descubierto = -50;

    }
    public void CambiarBanco(Banco banco){
        this.Banco = banco;
    }

    public void SacarDinero(int saldo){
        int saldo_total;
        saldo_total = this.saldo-saldo;
        if (saldo_total>= this.limite_Descubierto){
            this.saldo = this.saldo - saldo;
        }else {
            System.out.println("Error, saldo no disponible.");
        }

    }public void MeterDinero(int saldo){
        this.saldo = this.saldo + saldo;
    }



    public String mostrarInfo() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                ", limite_Descubierto=" + limite_Descubierto +
                ", Banco=" + Banco +
                ", nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
