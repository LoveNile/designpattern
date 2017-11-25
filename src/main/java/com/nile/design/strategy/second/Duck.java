package com.nile.design.strategy.second;

/**
 * 需求变更：添加橡皮Duck（不会叫，不会飞）
 *  思路 1：可以选择覆盖超类的方法，根据本身实现自己的行为
 *        如果以后要加入其他类型的Duck，那么都该将覆盖超类的行为。扩展变得很麻烦
 *  思路2：由于每种Duck的行为不同可以利用接口将fly 和 quck 从父类中分离出来
 *        利用接口后，虽然解决了不同的Duck可以实现自己的行为，但是如果Duck有几十种，那么代码变得很多而且无法复用。
 *        由于接口不具有实现代码，所以继承接口无法达到代码的复用。
 * @author Love.Kai
 *
 */
public abstract class Duck {
   
    //游泳
    public void swim() {
        System.out.println("游泳");
    }
    //外观 每种duck都有自己的外观
    public abstract void display();
}
