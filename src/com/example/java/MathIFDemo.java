package com.example.java;

import java.util.Comparator;
import java.util.function.BinaryOperator;

interface MathInterface<T>{
     T didMath(T x, T y);
}

public class MathIFDemo {
    public static <T> T doMath(MathInterface<T> mathIF, T int1, T int2) {
        return mathIF.didMath(int1, int2);
    }

    /*
    public static int doMathNew(BinaryOperator<Integer> mathIF, int int1, int int2){
        return MathIF.apply(int1,int2);
    }
*/
    public static <T> T add(BinaryOperator<T> binaryOperator, T x, T y) {
        return binaryOperator.apply(x, y);
    }

    public static int compareMath(Comparator<Integer> mathIF, int int1, int int2) {
        return mathIF.compare(int1, int2);
    }

    public static String test(String string){
        return string;
    }

    public static void main(String[] args) {
        int int1 = 5;
        int int2 = 6;
        //i1 + i2, i1 - i2 represent the return value. The function's method has a return type of int.
        System.out.println(doMath((i1, i2) -> i1 + i2, int1, int2));
        System.out.println(doMath((i1, i2) -> i1 - i2, int1, int2));
        System.out.println(doMath((i1, i2) -> i1 * i2, int1, int2));
        System.out.println(doMath((i1, i2) -> i1 / i2, int1, int2));

        //another example of lines 27-30, logic doesn't work - written as syntax example.
        //It looks different because it has more than one statement. Just like other lambda.
       /* System.out.println(doMath((i1,i2)->{
            if(i1>0)
                return i1 +i2;
            else
                return 0;}, int1, int2));*/
        System.out.println("x+y= "+add((x, y) -> {
            if (x + y > 12)
                return x + y + 1;
            else
                return 0;
        }, int1, int2));

        System.out.println(add((x,y)-> x+y, "Hello", "World"));
    }
}
