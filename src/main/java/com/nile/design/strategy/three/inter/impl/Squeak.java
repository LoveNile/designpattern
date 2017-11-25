package com.nile.design.strategy.three.inter.impl;

import com.nile.design.strategy.three.inter.IQuack;

public class Squeak implements IQuack {

    public void quack() {
        System.out.println("吱吱叫");
    }

}
