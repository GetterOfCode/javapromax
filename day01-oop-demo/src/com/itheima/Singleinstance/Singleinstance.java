package com.itheima.Singleinstance;



public class Singleinstance {
    public static Singleinstance instance = new Singleinstance();
    private Singleinstance(){}

    public static void main(String[] args) {
        Singleinstance instance1 = Singleinstance.instance;
        Singleinstance instance2 = Singleinstance.instance;
        System.out.println(instance1 == instance2);
    }
}
