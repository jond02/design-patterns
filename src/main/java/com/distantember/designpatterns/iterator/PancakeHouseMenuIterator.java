package com.distantember.designpatterns.iterator;

import java.util.List;

/**
 * Created by jondann on 2/12/17.
 */
public class PancakeHouseMenuIterator implements Iterator {

    private List<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    public boolean hasNext(){
        return position < menuItems.size();
    }

    public MenuItem next(){
        return menuItems.get(position++);
    }

}
