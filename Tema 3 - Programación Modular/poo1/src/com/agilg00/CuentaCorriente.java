package com.agilg00;


public class CuentaCorriente {
    private static String banco;
    float mSaldo;
    float mLimiteDescubrimiento;
    String mNombre;
    String mDNI;

    static int numero_director;


    public void crearCuenta(String DNI, String nombre, String nombre_Banco, int limDescubrimiento, int saldo) {
        this.mDNI = DNI;
        this.mNombre = nombre;
        this.mLimiteDescubrimiento = limDescubrimiento;
        this.mSaldo = saldo;
        banco = nombre_Banco;

    }

    public static String cambiar_banco(String nuevo_banco){
         banco = nuevo_banco;
         numero_director = 7;
         return "se cambió el nombre del banco a: ";
    }


    public boolean sacarDinero(float cantidad) {

        if (this.mSaldo-cantidad>= this.mLimiteDescubrimiento){
            this.mSaldo -= cantidad;
            System.out.println("Transacción posible, su nuevo saldo es de "+this.mSaldo);
            return true;
        }


        return false;
    }

    public void ingresarDinero(float cantidad) {

        this.mSaldo += cantidad;

    }

    public void mostrarInfo() {

        System.out.println("Información de la cuenta: ");
        System.out.println("Cliente: "+this.mNombre);
        System.out.println("DNI de cliente: "+this.mDNI);
        System.out.println("Saldo: "+mSaldo);
        System.out.println("Límite de descubrimiento: "+mLimiteDescubrimiento);
        System.out.println("Banco al que pertenece: " + banco);

    }

}

