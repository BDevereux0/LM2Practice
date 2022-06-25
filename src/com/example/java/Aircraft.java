package com.example.java;

public class Aircraft implements Transport{
    private String type;
    private String fixedOrRotary;

    public Aircraft(String type, String fixedOrRotary){
        this.type = type;
        this.fixedOrRotary=fixedOrRotary;
    }
    @Override
    public String getType() {
        System.out.println("test");
        return type;
    }

    @Override
    public String getMake() {
        return fixedOrRotary;
    }

    @Override
    public int getTotalDoors() {
        return 0;
    }

    @Override
    public void setType(String type) {
        System.out.println("Testing123");
        this.type = type;
    }
}
