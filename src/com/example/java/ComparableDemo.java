package com.example.java;

class Pet implements Comparable<Pet>{
    String name;
    int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Pet pet) {
        return this.getAge() - pet.getAge();
    }
}
public class ComparableDemo {


}
