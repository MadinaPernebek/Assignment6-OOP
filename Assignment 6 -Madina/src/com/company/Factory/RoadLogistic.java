package com.company.Factory;

public class RoadLogistic extends Logistic{

    @Override
    public Transport createTransport(){
        return new Truck();
    }
}

