package com.nile.design.observer.first;

public class ManObserver implements Observer {

    private Subject subject;

    //在对象初始化的时候传入主题,如果传入那么将无法使用其他方法
    public ManObserver(Subject subject) {
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
        System.out.println("man我已经更新了！");
    }

}
