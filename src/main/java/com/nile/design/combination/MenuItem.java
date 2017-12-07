package com.nile.design.combination;

public class MenuItem extends MenuComponent {
    private String name;

    public  MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
