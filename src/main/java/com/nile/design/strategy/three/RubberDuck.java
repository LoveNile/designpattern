package com.nile.design.strategy.three;

import com.nile.design.strategy.three.inter.impl.FlyNoWay;
import com.nile.design.strategy.three.inter.impl.MuteQuack;


public class RubberDuck extends Duck {

    public RubberDuck() {
        iFly = new FlyNoWay();
        iQuack = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("我是一只橡皮鸭");
    }

}
