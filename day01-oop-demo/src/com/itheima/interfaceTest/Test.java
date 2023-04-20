package com.itheima.interfaceTest;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("MSI");
        Mouse mouse = new Mouse("罗技");
        KeyBoard keyBoard = new KeyBoard("惠普");
        computer.start();
        computer.installUSB(mouse);
        computer.installUSB(keyBoard);
    }
}
