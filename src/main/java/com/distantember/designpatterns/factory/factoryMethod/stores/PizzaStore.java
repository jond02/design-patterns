package com.distantember.designpatterns.factory.factoryMethod.stores;

import com.distantember.designpatterns.factory.factoryMethod.pizzas.Pizza;

/**
 * Created by jondann on 1/16/17.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = createPizza(type);

        if (pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }

    //the factory method. Other methods operate on products produced by factory method
    public abstract Pizza createPizza(String type);
}
