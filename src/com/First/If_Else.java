package com.First;
import java.util.Objects;
import java.util.Scanner;

public class If_Else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // QUESTION 1 ----->

        System.out.println("Is it day :");
        String ans = sc.next();
        if (Objects.equals(ans, "yes") || Objects.equals(ans, "YES") || Objects.equals(ans, "Yes"))
            System.out.println("Sun is up");
        else
            System.out.println("Sun is down");

        // QUESTION 2 ---->

        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("You can vote");
        else
            System.out.println("you can't vote");


        // QUESTION 3 ----->

        System.out.println("Cost of pen is 10 and cost of copy is 40.. " +
                "Enter how much money do you have?? ");
        int m = sc.nextInt();
        if (m < 10) {
            System.out.println("Sorry! you can't buy anything");
            System.out.println("Get some cash");
        }
        else if (m >= 10 && m < 40)
            System.out.println("You can only buy pen");
        else if (m >= 40 && m < 50)
            System.out.println("You can buy either pen or copy");
        else
            System.out.println("You can buy both");
    }
}
