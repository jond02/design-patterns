package com.distantember.designpatterns.decorator;

/**
 * Created by jondann on 1/16/17.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost(){
        return 1.05;
    }
}
