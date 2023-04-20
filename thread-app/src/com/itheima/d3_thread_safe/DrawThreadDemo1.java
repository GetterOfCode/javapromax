package com.itheima.d3_thread_safe;

/**
 * 出现线程安全问题
 * 多线程同时访问共享资源
 */
public class DrawThreadDemo1 {
    public static void main(String[] args) {
        Account account = new Account("4846465", 100000);
        new DrawThread(account,"小明").start();

        new DrawThread(account,"小红").start();


    }
}
