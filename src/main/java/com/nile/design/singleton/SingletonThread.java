package com.nile.design.singleton;

public class SingletonThread {
    private static SingletonThread uniqueInstance;

    private SingletonThread() {};
    //使用synchronized关键字同步方法，牺牲性能的方式保证实例的唯一
    public static synchronized SingletonThread getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonThread();
        }
        return uniqueInstance;
    }
}
