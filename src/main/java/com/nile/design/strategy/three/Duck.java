package com.nile.design.strategy.three;

import com.nile.design.strategy.three.inter.IFly;
import com.nile.design.strategy.three.inter.IQuack;

/**
 * 通过前两种代码的思考，要想代码复用以及实现不同行为的代码，需要将变化的行为与不变化的行为分离出来，同时为了将自己的代码容易
 * 扩展，需要使代码变得有弹性，通过java运行时动态的改变行为的特点（多态），可以使代码变得更有弹性。
 * 针对接口（超类型）进行编程
 *
 * 思路： 由于不同种的Duck的Fly 以及 Quack 不同 所以它们是变化的行为将它们分离出。针对不同的种Duck的Fly我们可以实现不同的Fly方式
 *  同理Quack也一样比如FlyWithWings、 FlyNoWay
 *
 *  同时提供行为的set方法可以动态的设定Duck的行为。可以自由的扩展duck的行为不必去修改代码
 *  比如Duck如果有新的行为我们只需要实现特定的接口就行了。
 *
 *  Duck的行为通过组合的方式组装在一起，替代了继承
 *
 * @author Love.Kai
 *
 */
public abstract class Duck {
    IFly iFly;
    IQuack iQuack;

    public void performFly() {
        iFly.fly();
    }

    public void performQuack() {
        iQuack.quack();
    }

    //游泳
    public void swim() {
        System.out.println("游泳");
    }
    //外观 每种duck都有自己的外观
    public abstract void display();

    public void setiFly(IFly iFly) {
        this.iFly = iFly;
    }

    public void setiQuack(IQuack iQuack) {
        this.iQuack = iQuack;
    }

}
