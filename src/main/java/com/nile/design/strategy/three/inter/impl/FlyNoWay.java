package com.nile.design.strategy.three.inter.impl;

import com.nile.design.strategy.three.inter.IFly;

public class FlyNoWay implements IFly {

    public void fly() {
        System.out.println("我不会飞行！");
    }

}
