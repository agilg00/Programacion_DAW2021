package com.agilg00;

import java.util.Arrays;

public class Pizza {


    private Size size;
    private Ingrediente[] ingredientes;
    int ind_ingrediente;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", ingredientes=" + Arrays.toString(ingredientes) +
                ", ind_ingrediente=" + ind_ingrediente +
                '}';
    }


}
