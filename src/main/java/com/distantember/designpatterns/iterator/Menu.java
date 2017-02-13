package com.distantember.designpatterns.iterator;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
