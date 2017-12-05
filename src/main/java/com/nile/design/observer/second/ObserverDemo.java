package com.nile.design.observer.second;

import java.util.Observable;
import java.util.Observer;

/**
 * 根据API内置观察者接口实现观察者模式
 *
 */
public class ObserverDemo implements Observer {

    private ObserverableDemo observerableDemo;

    private ObserverDemo(ObserverableDemo observerableDemo) {
        this.observerableDemo = observerableDemo;
        this.observerableDemo.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof ObserverableDemo) {
            System.out.print(arg.toString());
        }
    }

    public void remove() {
        this.observerableDemo.deleteObserver(this);
    }
}
