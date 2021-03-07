package com.company.buildMethod;

public class House {
    private String foundationType;
    private int roomNumber;
    private String address;
    private boolean pool;
    private double area;
    private int floors;
    private boolean garden;
    private boolean statue;

    public void setFoundationType(String foundationType) {
        this.foundationType = foundationType;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public void setStatue(boolean statue) {
        this.statue = statue;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundationType='" + foundationType + '\'' +
                ", roomNumber=" + roomNumber +
                ", address='" + address + '\'' +
                ", pool=" + pool +
                ", area=" + area +
                ", floors=" + floors +
                ", garden=" + garden +
                ", statue=" + statue +
                '}';
    }
}
