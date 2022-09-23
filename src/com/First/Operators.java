package com.First;

public class Operators {
    public static void main(String[] args){
        // Arithmetic Operators ---->

        int a = 11;
        int b = 4;
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;   // Modulo
        System.out.println(sum + " and " + diff +" and " + mul + " and " + div+ " and " + rem);

        // Assignment operators ---->

        int p = 78;  // Here = is an assignment operator
        p++; // or it can be written as   p = p + 1
        System.out.println(p);
        int k = 5;
        k--;  // or can be written as k = k - 1
        System.out.println(k);

        // Comparison operators --->
        /* a == b     means a is equal to b
        a != b    means a is not equal to b
        a < b
        a > b
        a <= b
        a >= b
        * */

        // Logical operator ---->

        /*
        *   && AND operator  ----> when both conditions should be true
        *
        *   ||  OR operator ----> when anyone of conditions can be true or both
        *
        *   ! Negative operator ---->  It's is used for negative
        *   for example  if (!is_adult) --->  it will check for is not adult */

        //  Conditional operator ---->
        /*
        * int a = 10;
        * b = (a == 1) ? 20 : 30    if (a == 1 is true then b = 20 else 30)
        * */
    }
}
