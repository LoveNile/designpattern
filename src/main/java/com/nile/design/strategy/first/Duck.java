package com.nile.design.strategy.first;

/**
 * 使用标准的OO技术，实现一个模拟鸭子的游戏
 *  1 建立一个超类，让所有的种类的鸭子继承超类，不同的子类有不同的类型，提供默认的方法让子类覆盖实现
 * @author Love.Kai
 *
 */
public abstract class Duck {
    //叫声
    public void quack() {
        System.out.println("呱呱叫");
    }
    //游泳
    public void swim() {
        System.out.println("游泳");
    }
    public void fly() {
        System.out.println("飞行");
    }
    //外观 每种duck都有自己的外观
    public abstract void display();
}
