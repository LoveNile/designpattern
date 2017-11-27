package com.nile.design.test;

import com.nile.design.observer.first.ConcreteSubject;
import com.nile.design.observer.first.ManObserver;
import com.nile.design.observer.first.Subject;
import com.nile.design.observer.first.WomenObserver;

public class ObserverTesr {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        WomenObserver women = new WomenObserver(subject);
        ManObserver man = new ManObserver(subject);
        subject.notifyObservers();
    }
}
