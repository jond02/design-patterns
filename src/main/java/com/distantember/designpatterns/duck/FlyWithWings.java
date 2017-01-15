package com.distantember.designpatterns.duck;

/**
 * Created by jondann on 1/15/17.
 */
public class FlyWithWings implements FlyBehavior {

    public void fly(){
        System.out.println("I'm flying!");
    }
}
