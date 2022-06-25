package com.example.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ArrayListPractice {



    public static void main(String[] args) {

        ArrayList arrayListOne;

        arrayListOne = new ArrayList();

        ArrayList arrayList = new ArrayList();

        ArrayList<String> names = new ArrayList<String>(); //<String> means it will only accept Strings
        names.add("John Smith");
        names.add("Mohamed Alami");
        names.add("Oliver Miller");

        names.add(2, "Jack Ryan");
        names.set(0, "John Addams");
        names.remove(3);
        //names.removeRange(0,1); //this doesn't work for some reason.
        for (String x : names){
            System.out.println(x);
        }

        System.out.println(names); //debugging reasons.

        Iterator indivItems = names.iterator();  //lines 32-35 similar to for loop

        while (indivItems.hasNext()){
            System.out.println(indivItems.next());
        }

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);
        nameCopy.add("Brandon");
        String paulYoung = "Paul Young";
        names.add(paulYoung);

        if (names.contains(paulYoung)){
            System.out.println("Paul is here");
        }

        if (names.containsAll(nameCopy)){
            System.out.println("Everything in nameCopy is in names");
        }
        // Copied names to nameCopy
        // Added to names
        System.out.println("----------------------------");

        Object[] moreNames = nameCopy.toArray();

        System.out.println(Arrays.toString(moreNames));

    }
}
