package com.distantember.designpatterns.factory.factoryMethod.stores;


import com.distantember.designpatterns.factory.factoryMethod.pizzas.*;

/**
 * Created by jondann on 1/16/17.
 */
public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type){
        if (type.equals("cheese")){
            return new NYCheesePizza();
        } else if (type.equals("pepperoni")){
            return new NYPepperoniPizza();
        } else if (type.equals("clam")){
            return new NYClamPizza();
        } else if (type.equals("veggie")){
            return new NYVeggiePizza();
        } else {
            return null;
        }
    }

}
