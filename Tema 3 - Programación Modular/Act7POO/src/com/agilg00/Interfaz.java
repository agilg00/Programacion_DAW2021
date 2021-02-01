package com.agilg00;

public class Interfaz {


        public double freq = 80;
        private static final double step = 0.5;
        private static final double min = 80;
        private static final double max = 108;

        public void up (){
            if(freq+step>max)
                freq = min;
            else{
                freq += step;
            }

        }
        public void down (){
            if(freq-step<min){
                freq = max;
            } else{
                freq -= step;
            }
        }
        public double display (){
            return freq;
        }

    public static void main(String[] args) {

            Interfaz i1 = new Interfaz();

            i1.up();
        System.out.println(i1.display());
            i1.down();
        System.out.println(i1.display());
            i1.down();
        System.out.println(i1.display());
            i1.down();
        System.out.println(i1.display());


    }


}

