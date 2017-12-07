package com.nile.design.adapter.impl;

import com.nile.design.adapter.Duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
