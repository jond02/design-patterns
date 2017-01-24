package com.distantember.designpatterns.factory.simpleFactory;

/**
 * Created by jondann on 1/16/17.
 */
public class Main {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");
    }
}
