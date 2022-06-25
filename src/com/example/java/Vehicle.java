package com.example.java;

public class Vehicle implements Transport{
    private String type;  //car,suv,etc
    private String make; //ford, chevy, etc
    private int NumberOfDoors; //2-door, 4-door, etc

   public Vehicle(String type, String make, int NumberOfDoors){
        this.type = type;
        this.make = make;
        this.NumberOfDoors=NumberOfDoors;
    }

    public String getType(){
        return type;
    }

    public String getMake(){
        return make;
    }

    public int getTotalDoors(){
        return NumberOfDoors;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setTotalDoors(int NumberOfDoors) {
        this.NumberOfDoors = NumberOfDoors;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", totalDoors=" + NumberOfDoors +
                '}';
    }
}
