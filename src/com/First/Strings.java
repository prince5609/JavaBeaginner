package com.First;

public class Strings {
    public static void main(String[] args){
        // PRINT ------>

        System.out.println("HELLO WORLD");

        // STRING INTEGER LONG FLOAT BOOLEAN CHAR----->

        String name = "Prince";
        String name1 = "Tyagi";
        String name2 = name + name1;  // This is called concatenation of strings.
        int age = 27;
        int age2 = age + 3;
        long phone = 9013514202L;
        float height = 5.11F;
        char name_start_with = 'P';
        boolean is_adult = true;
        System.out.println("Hi i am  " + name2 + " and my age is "
                + age2 + " and my height is " + height + " feet");

        //  To find Length of String ----->

        System.out.println( "Length of name2 is " + name2.length());

        // TO FIND CHARACTER AT ANY POSITION ----->

        System.out.println("Char at third position is " + name2.charAt(3));

        //  REPLACE ----- >

        System.out.println("replacement ---> " + name2.replace("P", "T"));

        // Substring ----->

        System.out.println("Substring from 0 to 6 is " + name2.substring(0, 6));
        // Here char till position 5 will be counted not 6.

        // Final ---->
            // If we write float pi = 3.14F;   This can be change in future but....
            // if we write {final float pi = 3.14F;}   Now if we will try to change this value
            // in future this will give us error.

        // STRING BUFFER --->
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        sb.append(" java");   // STRING CAN BE APPEND.
        System.out.println(sb);
        sb.insert(0, "HEY ");
        System.out.println(sb);
        sb.replace(0,3, "code");  //from 0 to 3 index;
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());  // It Tells remaining Capacity Of String
        System.out.println(sb.length());


        String s = "Ram is a good boy ";
        String[] arr = s.split("");
        System.out.println("No of CHAR in String Ram is a good boy is " + arr.length);
        String [] arr1 = s.split(" ");
        System.out.println("No of WORDS in String Ram is a good boy is " + arr1.length);
    }
}