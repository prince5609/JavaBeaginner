package com.First;

public class Exception_Handling {
    public static void main(String[] args) {
        int[] marks = {98, 65, 85};
        try{
            System.out.println(marks[2]);
        } catch(Exception exception){
            System.out.println("There is an error");
        }finally{
        System.out.println("The name of the student is Aman");
        }
    }
}
