package com.company.Factory;

public class Truck implements Transport {
    private final int id;
    private double mileage;
    private String destination;

    public Truck(){
        id = 1;
    }

    public Truck(int id, double mileage, String destination) {
        this.id = id;
        this.mileage = mileage;
        this.destination = destination;
    }

    @Override
    public void deliver() {
        System.out.println("Truck is delivering by road now!");
    }
}

