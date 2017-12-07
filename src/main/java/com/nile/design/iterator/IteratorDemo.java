package com.nile.design.iterator;

public class IteratorDemo implements Iterator {
    private Object[] objects;
    private int position = 0;

    public IteratorDemo(Object[] objects) {
        this.objects = objects;
    }
    //如果下个元素位置大于或者等于长度，说明到末尾了，但是下个元素为空却不能（6 <= 4 || objects[4] == null）
    //如果遇见中间为空就会遍历不到以后的元素。
    public boolean hasNext() {
        if (objects.length <= position || objects[position] == null) {
            return false;
        }
        return true;
    }

    public Object next() {
        position += 1;
        return objects[position];
    }

    //如果不想支持移除的操作可以抛出UnsupportedOperationException异常
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
