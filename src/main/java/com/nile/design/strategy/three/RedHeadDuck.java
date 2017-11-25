package com.nile.design.strategy.three;

import com.nile.design.strategy.three.inter.impl.FlyWithWings;
import com.nile.design.strategy.three.inter.impl.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        iFly = new FlyWithWings();
        iQuack = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是红头鸭");
    }

}
