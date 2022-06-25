package com.example.java;

import java.util.function.IntBinaryOperator;

public class Greeter implements Greeting{
    public void greet(Greeting greeting){
        greeting.perform();
    }

    @Override
    public void perform() {
        System.out.println("Is this different");
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(greeter);
        greeter.greet(helloWorldGreeting);
        greeter.greet(()-> System.out.println("Hello World"));

        //anonymous class, same as lambda but more verbose?
        Greeting innerClassGreeting = new Greeting(){
            public void perform(){
                System.out.println("Hello World");
            }

        };
        innerClassGreeting.perform();

    }

}
