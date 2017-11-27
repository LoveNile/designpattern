package com.nile.design.observer.first;

public class WomenObserver implements Observer {

    private Subject subject;
    public WomenObserver(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    //提供set方法可以随时更换主题
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void remove() {
        this.subject.removerObserver(this);
    }
    @Override
    public void update() {
        System.out.println("women我已经更新了！");
    }

}
