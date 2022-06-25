package com.example.java;

import javax.crypto.spec.PSource;

public class HelloWorldGreeting implements Greeting{

    @Override
    public void perform() {
       System.out.println("Hello World");
    }
}
