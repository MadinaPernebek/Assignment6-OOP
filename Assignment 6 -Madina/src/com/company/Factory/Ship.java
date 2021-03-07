package com.company.Factory;

public class Ship implements Transport {
    private final int id;
    private String destination;
    private double capacity;

    public Ship(){
        id = 1;
    }

    public Ship(int id, String destination, double capacity) {
        this.id = id;
        this.destination = destination;
        this.capacity = capacity;
    }

    @Override
    public void deliver() {
        System.out.println("Ship is delivering by sea!");
    }
}
