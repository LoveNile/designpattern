package com.nile.design.test;

import com.nile.design.strategy.first.RedHeadDuck;
import com.nile.design.strategy.first.WhiteHeadDuck;

public class StrategyTest {
    //第一种需求的测试
    public static void main(String[] args) {
        WhiteHeadDuck mallardDuck = new WhiteHeadDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();
        RedHeadDuck red = new RedHeadDuck();
        red.display();
        red.quack();
        red.swim();

    }
}
