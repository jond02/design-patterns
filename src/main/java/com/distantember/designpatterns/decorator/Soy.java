package com.distantember.designpatterns.decorator;

/**
 * Created by jondann on 1/16/17.
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        return beverage.cost() + .15;
    }
}
