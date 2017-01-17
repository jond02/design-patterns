package com.distantember.designpatterns.decorator;

/**
 * Created by jondann on 1/16/17.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost(){
        return .99;
    }
}
