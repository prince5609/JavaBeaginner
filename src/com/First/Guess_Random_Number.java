package com.First;
import java.util.Scanner;
public class Guess_Random_Number {
    public static void main(String[] args){
        int num = (int)(Math.random()*100);
        System.out.println(num);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you have guessed :");
        while(true){

            int guess = sc.nextInt();
            if (guess == num) {
                System.out.println("Congrats you have guessed the right number");
                break;
            }
            else if (guess < num){
                System.out.println("Guess is less then the number");
                System.out.println("Guess the number again :");
            }
            else {
                System.out.println("Guess is greater then the number");
                System.out.println("Guess the number again :");
                }

        }
    }
}
