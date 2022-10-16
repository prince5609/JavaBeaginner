package com.First;



@FunctionalInterface
public interface LambdaExpression {
    void print();

}

class abc {
    public static void main(String[] args) {
        // Implementing interface using anonymous class
        LambdaExpression practice = new LambdaExpression() {
            @Override
            public void print() {
                System.out.println("hello anonymous");
            }
        };

        // Implementing interface using Lambda Expression class
        LambdaExpression lambda = ()->{
            System.out.println("hello lambda");
        };

        practice.print();
        lambda.print();
    }
}