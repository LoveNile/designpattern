package com.nile.design.adapter;

import com.nile.design.adapter.impl.TurkeyAdapter;
import com.nile.design.adapter.impl.WildTurkey;

import java.util.HashMap;

public class TestAdapter {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey);
        adapter.fly();
        adapter.quack();
        new HashMap<String, Object>();
    }
}
