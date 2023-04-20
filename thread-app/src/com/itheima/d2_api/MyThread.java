package com.itheima.d2_api;

public class MyThread extends Thread{
    public MyThread(){

    }
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyThread.currentThread().getName()+"子线程输出："+i);
        }
    }
}
