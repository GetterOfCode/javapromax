package com.itheima.d1_create;



public class ThreadDemo2Other {
    public static void main(String[] args) {

        new Thread( () ->{
                for (int i = 0; i < 100; i++) {
                    System.out.println("子线程输出："+i);
                }

        }).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程输出："+i);
        }



    }
}
