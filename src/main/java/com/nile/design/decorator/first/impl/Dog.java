package com.nile.design.decorator.first.impl;

import com.nile.design.decorator.first.Animal;

/**
 * 被装饰类
 */
public class Dog implements Animal {

    public String describe() {
        return "我是一个小狗";
    }
}
