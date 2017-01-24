package com.distantember.designpatterns.factory.factoryMethod.pizzas;

/**
 * Created by jondann on 1/16/17.
 */
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza(){
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

}
