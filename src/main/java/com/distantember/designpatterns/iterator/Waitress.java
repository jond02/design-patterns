package com.distantember.designpatterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by jondann on 2/12/17.
 */
public class Waitress {

    private List<Menu> menus;

    public Waitress(List<Menu> menus){
        this.menus = menus;
    }

    public void printMenu(){

       Iterator<Menu> menuIterator = menus.iterator();
       while (menuIterator.hasNext()){
           Menu menu = menuIterator.next();
           printMenu(menu.createIterator());
       }

    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }

}
