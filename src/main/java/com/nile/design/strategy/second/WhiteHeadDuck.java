package com.nile.design.strategy.second;

/**
 * Duck的一个类型
 * @author Love.Kai
 *
 */
public class WhiteHeadDuck extends Duck implements IFly, IQuack {

    @Override
    public void display() {
        System.out.println("我是白头鸭");
    }

    public void quack() {
        // TODO Auto-generated method stub
        
    }

    public void fly() {
        // TODO Auto-generated method stub
        
    }

}
