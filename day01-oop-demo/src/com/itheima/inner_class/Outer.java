package com.itheima.inner_class;

import javax.xml.namespace.QName;

public class Outer {
    private static String name = "张三";

    public Outer() {
    }

    public Outer(String name) {
        this.name = name;
    }

    public class Inner{
        private String innerName;

        public Inner() {
        }

        public Inner(String innerName) {
            this.innerName = innerName;
        }

        public void show(){
            System.out.println(name+innerName);
        }
    }
    public static class Inner2{
        public void show(){
            System.out.println(name);
        }
    }
}
