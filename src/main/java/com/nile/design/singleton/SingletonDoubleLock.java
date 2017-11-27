package com.nile.design.singleton;

public class SingletonDoubleLock {
    private volatile static SingletonDoubleLock uniqueInstance;

    private SingletonDoubleLock() {};
    //JDK1.5之后才可以这样使用
    //双重检查锁尽性判定实例的唯一性，只有当实例为空时才开始同步 volatile 关键字可以在变量改变是及时通知主内存。
    public static SingletonDoubleLock getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleLock.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleLock();
                }
            }
        }
        return uniqueInstance;
    }
}
