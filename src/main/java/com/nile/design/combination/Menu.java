package com.nile.design.combination;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> list = new ArrayList<MenuComponent>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
        Iterator<MenuComponent> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }
}
