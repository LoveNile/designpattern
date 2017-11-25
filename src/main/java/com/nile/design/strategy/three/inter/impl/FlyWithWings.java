package com.nile.design.strategy.three.inter.impl;

import com.nile.design.strategy.three.inter.IFly;

public class FlyWithWings implements IFly {

    public void fly() {
       System.out.println("正常的飞行");
    }

}
