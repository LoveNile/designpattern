package com.nile.design.combination;

/**
 * 打印“菜单”中的所有项，包括子菜单和普通项,通过java多态，实现打印子菜单
 * 为了不让用户调用超类的方法，可以在方法体没抛出UnsupportedOperationException
 */
public abstract class MenuComponent {
    public void print() {
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
}
