package com.distantember.designpatterns.strategy;

/**
 * Created by jondann on 1/15/17.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());
        mallard.performFly();
        mallard.performQuack();
    }
}
