package com.company;

public class OilCompany extends Company implements IPO{
    String country;
    int storage;

    public OilCompany(String name, int numOfWorkers, int marketCap,String country, int storage) {
        this.name = name;
        this.numOfWorkers = numOfWorkers;
        this.marketCap = marketCap;
        this.country = country;
        this.storage = storage;
    }

    void bankrupcy(){
        numOfWorkers=0;
        marketCap=0;
    }

    public void marketCap(){
        System.out.println(marketCap);
    }
}
