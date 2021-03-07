package com.company.AbstractMethod;

public class ArtDecoFurniture implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}

