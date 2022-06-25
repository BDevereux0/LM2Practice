package com.example.java;

import java.util.ArrayList;

public class GenericsPractice {

    static class Test<T>{
        T obj;
        Test(T obj){
            this.obj = obj;
        }
        public T getObject() {
            return this.obj;
        }

    }

    public static void main(String[] args) {
        ArrayList<Test> ta = new ArrayList<>();


        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        Test<String> sObj = new Test<String>("Quentin is the best");
        System.out.println(sObj.getObject());

        for (int i = 0; i< 50; i++){
            System.out.print("-");
        }

        ArrayList<Integer> ia = new ArrayList<>();



    }

}
