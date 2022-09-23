package com.First;

public class Break_Continue {
    public static void main(String[] args){
        int i = 0;
        while(true){
            if (i == 3){
                i++;
                continue;    // Means do nothing just move forward
            }
            System.out.println(i);
            i++;
            if ( i > 5){
                break;
            }
        }
    }
}

