package com.company;

import java.util.Date;
import java.util.HashMap;

public class TechCompany extends Company implements Investments, IPO{
    Date nextProducts;
    String manufacturerCountry;
    HashMap<String,String> products;

    public TechCompany(String name, int numOfWorkers, int marketCap ,Date nextProducts,
                       String manufacturerCountry, HashMap<String, String> products) {
        this.name = name;
        this.numOfWorkers = numOfWorkers;
        this.marketCap = marketCap;
        this.nextProducts = nextProducts;
        this.manufacturerCountry = manufacturerCountry;
        this.products = products;
    }

    void addProduct(String k,String v){
        products.put(k,v);
    }

    public void marketCap(){
        System.out.println(marketCap);
    }

    public int add(int funds){
        marketCap+=funds;
        return marketCap;
    }
}
