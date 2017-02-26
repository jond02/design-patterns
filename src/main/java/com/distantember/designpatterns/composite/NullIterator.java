package com.distantember.designpatterns.composite;

import java.util.Iterator;

/**
 * Created by jondann on 2/26/17.
 */
public class NullIterator implements Iterator<MenuComponent> {

    public MenuComponent next(){
        return null;
    }

    public boolean hasNext(){
        return false;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

}
