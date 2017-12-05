package com.nile.design.observer.second;

import java.util.Observable;

/**
 * 要使用内置API实现观察者，需要扩展内置类Observerable
 *  需要将对象变成观察者，需要实现接口observer
 *
 */
public class ObserverableDemo extends Observable {

    //通知观察者可以使用notifyObservers，setChanged方法可以更加弹性的控制同步
    public void changeData() {
        setChanged();
        notifyObservers();
    }
}
