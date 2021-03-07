package com.company;


import com.company.AbstractMethod.*;
import com.company.Factory.RoadLogistic;
import com.company.Factory.SeaLogistic;
import com.company.Factory.Transport;
import com.company.buildMethod.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method");
        //Factory method
        SeaLogistic seaLogistic = new SeaLogistic();
        RoadLogistic roadLogistic = new RoadLogistic();
        Transport ship = seaLogistic.createTransport();  //Creating ship with createTransport method
        Transport truck = roadLogistic.createTransport();
        ship.deliver();
        truck.deliver();

        System.out.println("Abstract Factory Method");

        //Abstract Method
        ArtDecoFurniture artDecoFurnitureFactory = new ArtDecoFurniture(); //Creating factories
        ModernFurniture modernFurnitureFactory = new ModernFurniture();
        VictorianFurniture victorianFurnitureFactory = new VictorianFurniture();

        Sofa artDecoSofa =  artDecoFurnitureFactory.createSofa();
        Table artDecoTable = artDecoFurnitureFactory.createTable();
        Chair artDecoChair = artDecoFurnitureFactory.createChair();

        Sofa modernSofa = modernFurnitureFactory.createSofa();
        Table modernTable = modernFurnitureFactory.createTable();
        Chair modernChair = modernFurnitureFactory.createChair();

        Sofa victorianSofa = victorianFurnitureFactory.createSofa();
        Table victorianTable = victorianFurnitureFactory.createTable();
        Chair victorianChair = victorianFurnitureFactory.createChair();

        victorianSofa.layDown();
        modernChair.sitOn();
        artDecoTable.workBy();

        System.out.println("Builder Method");
        HouseBuild luxuryHouse = new luxuryHouse();
        Director directorLUX = new Director(luxuryHouse); // Director class

        House houseLUX = directorLUX.constructHouse(); //Calling builder method
        System.out.println("LUXURY House: ");
        System.out.println(houseLUX);

        HouseBuild billionaireHouse = new oracleOfHouseBuild();
        Director directorBillionaire = new Director(billionaireHouse);

        System.out.println();

        House houseBillionaire = directorBillionaire.constructHouse();
        System.out.println("Billionaire House:");
        System.out.println(houseBillionaire);


    }
}
