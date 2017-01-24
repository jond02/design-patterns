package com.distantember.designpatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by jondann on 1/16/17.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) throws FileNotFoundException {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        //java I/O example
        //InputStream fis = new FileInputStream("");
        //fis = new BufferedInputStream(fis);

    }
}

