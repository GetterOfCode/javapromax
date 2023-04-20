package com.itheima.d6_thread_synchronized_lock;




public class TestSafeDemo {
    public static void main(String[] args) {
        Account account = new Account("4846465", 100000);
        new DrawThread(account, "小明").start();

        new DrawThread(account, "小红").start();

        Account account1 = new Account("4984944", 100000);
        new DrawThread(account1, "小黑").start();
        new DrawThread(account1, "小白").start();
    }
}