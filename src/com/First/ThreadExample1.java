package com.First;

class ThreadExample1 implements Runnable {
    public void run() {
        System.out.println("Thread 1 is running");
    }
}

class ThreadExample2 implements Runnable {
    public void run() {
        System.out.println("Thread 2 is running");
    }
}
class ThreadApplication {
    public static void main(String[] args) {
        ThreadExample1 obj1 = new ThreadExample1();
        Thread t1 = new Thread(obj1);
        t1.start();

        ThreadExample2 obj2 = new ThreadExample2();
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}

