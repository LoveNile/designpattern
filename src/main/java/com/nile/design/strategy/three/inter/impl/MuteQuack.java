package com.nile.design.strategy.three.inter.impl;

import com.nile.design.strategy.three.inter.IQuack;

public class MuteQuack implements IQuack {


    public void quack() {
        System.out.println("我不会叫");
    }

}
