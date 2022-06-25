package com.example.java;

public class TypeInterfaceExample {

    interface StringLengthLambda{
        int getLength(String s);
    }

    public static void main(String[] args) {
        StringLengthLambda myLambda = s-> s.length();
        System.out.println(myLambda.getLength("Hello World"));

    }
}
