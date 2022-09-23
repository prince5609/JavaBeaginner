package com.First;

public class Functions_Methods {
    public static void printJava(){   // Here bracket is blank as we are not taking any input
        System.out.println("Hello java");
    }
    public static void printName(String name){    // Here in bracket we have written String name
        // as we will take a name as input (Line 15 & 16)
        System.out.println(name);
    }
    public static void main(String[] args) {
        printJava();
        printJava();
        printJava();
        printName("Prince");
        printName("Aryan");

    }
}
