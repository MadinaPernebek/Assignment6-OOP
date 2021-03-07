package com.company.AbstractMethod;

public class ModernChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("Modern chair has pretty thin and elegant legs");
    }

    @Override
    public void sitOn() {
        System.out.println("It is very comfortable to sit on modern chair");
    }
}
