package com.distantember.designpatterns.strategy;

/**
 * Created by jondann on 1/15/17.
 */
public class FlyNoWay implements FlyBehavior {

    public void fly(){
        System.out.println("I can't fly");
    }
}
