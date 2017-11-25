package com.nile.design.strategy.three;

import com.nile.design.strategy.three.inter.impl.FlyWithWings;
import com.nile.design.strategy.three.inter.impl.Squeak;

/**
 * Duck的一个类型
 * @author Love.Kai
 *
 */
public class WhiteHeadDuck extends Duck {

    public WhiteHeadDuck() {
        iFly = new FlyWithWings();
        iQuack = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("我是白头鸭");
    }

}
