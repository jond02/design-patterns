package com.distantember.designpatterns.factory.simpleFactory;

/**
 * Created by jondann on 1/16/17.
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = factory.createPizza(type);

        if (pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }
}
