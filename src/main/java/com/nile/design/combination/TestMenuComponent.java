package com.nile.design.combination;

public class TestMenuComponent {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("总菜单");
        MenuComponent menu2 = new Menu("甜品菜单");
        MenuComponent menu3 = new Menu("素菜菜单");
        MenuComponent menu4 = new Menu("荤菜菜单");
        menu1.add(menu2);
        menu1.add(menu3);
        menu1.add(menu4);
        menu2.add(new MenuItem("面包"));
        menu2.add(new MenuItem("牛奶"));
        menu3.add(new MenuItem("土豆丝"));
        menu4.add(new MenuItem("鱼香肉丝"));

        menu1.print();
    }
}
