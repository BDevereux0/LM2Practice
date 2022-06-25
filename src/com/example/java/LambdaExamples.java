package com.example.java;

import java.util.Comparator;

public class LambdaExamples {

    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int comparison = stringComparator.compare("Hello", "World");
        System.out.println(comparison);

        Comparator<String> stringComparatorLambda =
                (o1, o2) -> o1.compareTo(o2);

        int lambdaComparison = stringComparatorLambda.compare("Hello", "World");
        System.out.println(lambdaComparison);

        MyFunction myFunction = (name, age) -> {
            System.out.println("Name is: " + name + " age is: " + age);
            return name + " + " + age;};

        myFunction.apply("Quentin", 1);
        String returnValue = myFunction.apply("Quentin", 1);
        System.out.println(returnValue);

        MyFunction myFunction2 = myFunction;
        String returnValue2 = myFunction2.apply("Katie", 35);
        System.out.println(returnValue2);


    }

}
