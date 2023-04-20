package com.itheima.inner_class;

public class Test {
    public static void main(String[] args) {
        //Outer.Inner inner = new Outer("外部").new Inner("内部");
        //inner.show();
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner2.show();
    }
}
