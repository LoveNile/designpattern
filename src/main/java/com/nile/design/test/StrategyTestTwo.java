package com.nile.design.test;

import com.nile.design.strategy.three.Duck;
import com.nile.design.strategy.three.RedHeadDuck;
import com.nile.design.strategy.three.RubberDuck;
import com.nile.design.strategy.three.WhiteHeadDuck;

public class StrategyTestTwo {
    public static void main(String[] args) {
        Duck whiteHeadDuck = new WhiteHeadDuck();
        whiteHeadDuck.display();
        whiteHeadDuck.swim();
        whiteHeadDuck.performFly();
        whiteHeadDuck.performQuack();
        Duck red = new RedHeadDuck();
        red.display();
        red.swim();
        red.performFly();
        red.performQuack();
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.swim();
        rubber.performFly();
        rubber.performQuack();
    }
}
