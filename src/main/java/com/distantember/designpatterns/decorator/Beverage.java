package com.distantember.designpatterns.decorator;

/**
 * Created by jondann on 1/16/17.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
