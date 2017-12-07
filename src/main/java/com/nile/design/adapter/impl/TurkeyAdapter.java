package com.nile.design.adapter.impl;

import com.nile.design.adapter.Duck;
import com.nile.design.adapter.Turkey;

/**
 * 为了让火鸡适配Duck 适配器需要实现Duck的行为，但是行为的具体实现是有火鸡完成的.
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
