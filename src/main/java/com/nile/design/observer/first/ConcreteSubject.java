package com.nile.design.observer.first;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void removerObserver(Observer observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer s : observers) {
            s.update();
        }
    }

//  这个方法是在数据改变时触发改变。
//    public void Change() {
//        notifyObservers();
//    }

}
