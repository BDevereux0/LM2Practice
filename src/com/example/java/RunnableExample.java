package com.example.java;

public class RunnableExample implements InterfaceInConstructor {

    InterfaceInConstructor interfaceInConstructor;

    public RunnableExample(InterfaceInConstructor x){
        this.interfaceInConstructor = x;
    }

    public static void main(String[] args) {
        /*Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });*/

       // myThread.run();

        //pretty sure this works because Thread has a constructor that takes runnable as a parameter.

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
        myLambdaThread.run();

        RunnableExample runnableExample = new RunnableExample(() -> System.out.println("Does this work?"));

        runnableExample.demo();
    }

    @Override
    public void demo() {

    }
}
