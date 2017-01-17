package com.distantember.designpatterns.decorator;

/**
 * Created by jondann on 1/16/17.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost(){
        return .89;
    }
}
