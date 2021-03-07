package com.company.AbstractMethod;

public class ArtDecoChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("Art Deco chair has very smooth legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You get unordinary vibes sitting on ArtDeco chair");
    }
}

