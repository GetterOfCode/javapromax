package com.itheima.d7_thread_comunication;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("123456",0);
        new DrawThread(account,"小红").start();
        new DrawThread(account,"小丽").start();
        new DrawThread(account,"阿狸").start();


        new DepositThread(account,"张强").start();
        new DepositThread(account,"王海").start();
        new DepositThread(account,"宋立").start();
        //new DepositThread(account,"张强");
    }
}
