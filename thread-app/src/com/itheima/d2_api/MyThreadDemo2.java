package com.itheima.d2_api;

public class MyThreadDemo2 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyThread.currentThread().getName()+"输出："+i);
            if(i == 3){
                //让当前线程进入休眠状态

                Thread.sleep(3000);
            }
        }
    }
}
