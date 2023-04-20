package com.itheima.d1_create;

import java.util.TreeMap;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //new 一个新线程对象
        Thread t = new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出："+i);
        }

    }
}
class MyThread extends Thread{
    /**
     *
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出："+i);

        }
    }
}
