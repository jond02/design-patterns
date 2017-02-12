package com.distantember.designpatterns.template;

/**
 * Created by jondann on 2/11/17.
 */
public class BeverageTestDrive {

    public static void main(String[] a) {

        CaffeineBeverageWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();

    }
}
