package com.First;

public class Interface_Class {
    interface area{
        final static float pi = 3.14F;   // If we don't  write final & static then automatically it will take it as static & final.
        float calculate(float x, float y);
    }

    static class rectangle implements area {
        public float calculate(float x, float y){
            return x * y;
        }
    }

    static class circle implements area {
        public float calculate(float x, float y) {
            return x * x * pi;
        }
    }

    static class demo{
        public static void main(String[] args){
            area a;    // This is how to make object of interface.

            a = new rectangle();   // Making rectangle class object equal to interface object.
            System.out.println("Area of rectangle is " + a.calculate(10, 20));

            a = new circle();
            System.out.println("Area of circle is " + a.calculate(10, 0));
        }
    }
}
