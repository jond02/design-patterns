package com.distantember.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jondann on 2/26/17.
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;
    private Iterator<MenuComponent> iterator;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }

    public Iterator<MenuComponent> createIterator() {
        if (iterator == null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print(){
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
