package com.First;

public class ThreadExample implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String [] args){
        ThreadExample obj = new ThreadExample();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
