package com.distantember.designpatterns.factory.factoryMethod.pizzas;

/**
 * Created by jondann on 1/16/17.
 */
public class NYCheesePizza extends Pizza {

    public NYCheesePizza(){
        name = "chicago style deep dish pizza";
        dough = "extra thick crust dough";
        sauce = "tomato sauce";
        toppings.add("shredded mozzarella cheese");
    }

    @Override
    public void cut(){
        System.out.println("cutting the pizza into square slices");
    }

}
