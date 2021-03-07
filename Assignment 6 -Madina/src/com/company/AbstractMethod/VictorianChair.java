package com.company.AbstractMethod;

public class VictorianChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("Victorian chairs have artsy legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You feel yourself like a king on Victorian chairs");
    }
}

