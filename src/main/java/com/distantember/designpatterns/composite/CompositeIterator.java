package com.distantember.designpatterns.composite;



import java.util.Iterator;
import java.util.Stack;

/**
 * Created by jondann on 2/26/17.
 */
public class CompositeIterator implements Iterator {

    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    public Object next() {

        if (hasNext()){
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();

            stack.push(component.createIterator());

            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {

        if (stack.empty()) {

            return false;

        } else {

            Iterator<MenuComponent> iterator = stack.peek();
            if (iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}
