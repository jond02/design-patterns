package com.distantember.designpatterns.iterator;

import java.util.Iterator;

/**
 * Created by jondann on 2/12/17.
 */
public class DinerMenuIterator implements Iterator {

    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);

    }

    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    public void remove() {

        if (position < 1){
            throw new IllegalStateException("Can't remove an item until at least one next()");
        }

        if (items[position - 1] != null) {

            for (int i = position - 1; i < items.length - 1; i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
