package com.First;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // FOR LOOP ---->

        // WRITE NUMBER FROM 1 TO 100 --->

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }

        // WHILE LOOP --->

        int j = 1;
        while (j <= 100) {
            System.out.println(j);
            j++;
        }

        // DO WHILE --->

        int k = 1;
        do{
            System.out.println(k);
            k++;
        } while (k <= 100);

        // Question -->

        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Enter the positive number :");
            num = sc.nextInt();
            System.out.print("here is your number : ");
            System.out.println(num);
        } while( num >= 0 );
        System.out.println("Sorry that's a negative number");
        }
}
