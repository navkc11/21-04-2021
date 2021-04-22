package com.company;

public class Insdustrial extends Company implements Investments {
    String type;
    int numOfPlants;

    public Insdustrial(String name, int numOfWorkers, int marketCap,String type, int numOfPlants) {
        this.name = name;
        this.numOfWorkers = numOfWorkers;
        this.marketCap = marketCap;
        this.type = type;
        this.numOfPlants = numOfPlants;
    }

    public int add(int funds){
        marketCap+=funds;
        return marketCap;
    }

}
