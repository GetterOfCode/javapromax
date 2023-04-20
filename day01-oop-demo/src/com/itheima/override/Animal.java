package com.itheima.override;

public class Animal {
    String name = "人生";

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(name+"这个动物在跑！");
    }
}

