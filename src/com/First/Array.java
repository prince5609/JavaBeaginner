package com.First;
import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] marks = new int[4];
        marks[0] = 95;
        marks[1] = 89;
        marks[3] = 86;
        System.out.println(marks[0]);

        // IF WE DON'T GIVE ANY VALUE TO ANY ARRAY SO BY DEFAULT IT WILL TAKE VALUE 0 -->
        // System.out.println(marks[2]);    IT WILL GIVE 0

        // LENGTH ---->

        System.out.println(marks.length);

        // SORT ---->

        System.out.println("Before sort marks at 0 is " + marks[0]);
        Arrays.sort(marks);
        System.out.println("After sort marks at 0 is " + marks[0]);
        System.out.println("after sort ----> " + marks);

        // we can also make array like ---->

        int[] marks2 = {65, 89, 36, 98};
        System.out.println("Array marks2 [0] is " + marks2[0]);

        // 2D ARRAYS ---->

        int[][] final_marks = {{98,25,68,49}, {69,87,58,29}};
        System.out.println("Marks of first student in second subject is " + final_marks[0][1] +
                " and marks of second student in third subject is " + final_marks[1][2]);
    }
}
