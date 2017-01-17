package com.distantember.designpatterns.strategy;

/**
 * Created by jondann on 1/15/17.
 */
public class Squeak implements QuackBehavior {

    public void quack(){
        System.out.println("Squeak");
    }
}
