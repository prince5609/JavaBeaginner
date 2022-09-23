package com.First;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        // For string input
        System.out.println("Input your name : ");
        String name = sc.next();  // This will take only a single word
        System.out.println("Your name is : " + name);
        System.out.println("Input the line : ");
        String line = sc.nextLine(); // This will take complete line
        System.out.println("The Line is : " + line);
    }
}
