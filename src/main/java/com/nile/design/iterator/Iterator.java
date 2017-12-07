package com.nile.design.iterator;

/**
 * 手动实现迭代器
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
    public void remove();
}
