package com.nile.design.singleton;

/**
 * 单件模式，对象的实例化只有一个
 * @author Love.Kai
 *
 */
public class Singleton {
    private static Singleton uniqueInstance;
    //在类加载到虚拟机的时候就进行实例化
    //private static Singleton uniqueInstance = new Singleton();
    private Singleton() {};

    //延迟实例化 等到使用的时候才会加载
    private static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }


}
