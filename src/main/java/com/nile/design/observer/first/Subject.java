package com.nile.design.observer.first;

/**
 * 观察者模式，定义了对象的一对多依赖（一个主题，多个订阅者）
 * 针对接口编程，而不是实现编程，主题和订阅者都应该是接口，让具体的类去实现。
 * @author Love.Kai
 *
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removerObserver(Observer observer);
    public void notifyObservers();

}
