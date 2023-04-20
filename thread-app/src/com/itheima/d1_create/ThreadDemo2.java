package com.itheima.d1_create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建一个任务对象
        Runnable target =  new MyRunnable();
        new Thread(target).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出："+i);
        }



    }
}
/**
 * 定义一个线程任务类 实现Runnable接口
 *
 */
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出："+i);
        }
    }
}