package com.company.buildMethod;

public class luxuryHouse implements HouseBuild{
    private House house;

    public luxuryHouse() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        System.out.println("The foundation is built");
        house.setFoundationType("Pile foundation");
    }

    @Override
    public void buildStatue() {
        System.out.println("Great statue is set");
        house.setStatue(true);
    }

    @Override
    public void buildRooms() {
        System.out.println("Luxury house has to have a lot of rooms!");
        house.setRoomNumber(15);
    }

    @Override
    public void setAddress() {
        System.out.println("So as it's luxury, address is a private");
        house.setAddress("Somewhere far far away(Baker Street 221B)");
    }

    @Override
    public void buildGarden() {
        System.out.println("It has a BIG garden!");
        house.setGarden(true);
    }

    @Override
    public void buildPool() {
        System.out.println("Kendrick Lamar approves, man");
        house.setPool(true);
    }

    @Override
    public void setArea() {
        System.out.println("OMG! Very much big!");
        house.setArea(150000);
    }

    @Override
    public void buildFloor() {
        System.out.println("At least 3 floors(basement)");
        house.setFloors(4);
    }

    @Override
    public House getHouse(){
        System.out.println("Luxury house built.");
        return house;
    }
}

