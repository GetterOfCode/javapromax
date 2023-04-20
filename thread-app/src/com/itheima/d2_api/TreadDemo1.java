package com.itheima.d2_api;

public class TreadDemo1 {
    public static  void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();

        Thread t2 = new MyThread();
        t2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"主线程输出："+i);
        }

    }
}
