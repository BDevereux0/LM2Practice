package com.example.java;

interface MyFunctionalInterface{
    void doSomething(String str1, String str2);
}

class ConcatString implements MyFunctionalInterface{

    @Override
    public void  doSomething(String str1, String str2) {
        System.out.println(str1 + str2);
    }
}
class AddLenStr implements MyFunctionalInterface{
    @Override
    public void doSomething(String str1, String str2){
        System.out.println(str1.length() + str2.length());
    }
}

public class FIDemo {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        //lines 28 - 31 are the old way of using functional interfaces.
        ConcatString concatString = new ConcatString();
        concatString.doSomething(str1, str2);
        AddLenStr addLenStr = new AddLenStr();
        addLenStr.doSomething(str1, str2);

        //abstract method for MyFunctionalInterface
        MyFunctionalInterface concatStr = new MyFunctionalInterface() {
            @Override
            public void doSomething(String str1, String str2) {
                System.out.println(str1 + " "+ str2);
            }
        };
        concatStr.doSomething(str1, str2);

        MyFunctionalInterface lambdaConcatStr = (s1, s2) -> {
            System.out.println(s1 + " Q "+ s2);
        };
        lambdaConcatStr.doSomething(str1, str2);

        MyFunctionalInterface lambdaAddLenStr =(s1, s2)->{
            System.out.println(s1.length() + s2.length());
        };

        lambdaAddLenStr.doSomething(str1, str2);


    }
}
