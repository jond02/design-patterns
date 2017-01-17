package com.distantember.designpatterns.decorator;

/**
 * Created by jondann on 1/16/17.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
