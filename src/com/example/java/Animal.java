package com.example.java;

public class Animal {
    private String type;
    private String name;
    private int age;
    private boolean hasFur;

   public Animal (String type, String name, int age, boolean hasFur){
        this.type=type;
        this.name=name;
        this.age=age;
        this.hasFur=hasFur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " {type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hasFur=" + hasFur +
                '}';
    }
}

