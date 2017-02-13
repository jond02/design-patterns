package com.distantember.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jondann on 2/12/17.
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        List<Menu> menus = new ArrayList<Menu>(){{
            add(new PancakeHouseMenu());
            add(new DinerMenu());
            add(new CafeMenu());
        }};

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
