package com.distantember.designpatterns.decorator;

/**
 * Created by jondann on 1/16/17.
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        return beverage.cost() + .10;
    }
}
