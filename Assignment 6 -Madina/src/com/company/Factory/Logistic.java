package com.company.Factory;

abstract class Logistic {
    abstract Transport createTransport();

    public void planDelivery(){
        Transport t = createTransport();
    }

}

