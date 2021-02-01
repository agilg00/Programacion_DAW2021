package com.agilg00;

public class Bombilla {




    private boolean Status = false;

    public boolean Estado(){
            return Status;
    }

    public boolean Encender(){
        return Status = true;
    }
    public boolean Apagar(){
        return Status = false;
    }

    public static boolean FalloFusible(Bombilla bombillaX){
        return bombillaX.Status = false;
    }


    public static void main(String[] args) {

        Bombilla b1 = new Bombilla();
        Bombilla cocina = new Bombilla();
        Bombilla baño1 = new Bombilla();

        b1.Apagar();
        System.out.println("b1 is " + b1.Estado());

        b1.Encender();

        System.out.println(b1.Estado());

        FalloFusible(b1);

        System.out.println(b1.Estado());

        cocina.Encender();
        System.out.println("cocina is "+cocina.Estado());

        System.out.println("baño is "+baño1.Estado());





    }
}
