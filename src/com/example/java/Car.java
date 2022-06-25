package com.example.java;

public class Car extends Vehicle{

   public Car(String type, String make, int NumberOfDoors) {
        super(type, make, NumberOfDoors);
    }

    public String carGoesVroom(){
        return "Vroom";
    }


}
