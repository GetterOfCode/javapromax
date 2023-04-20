package com.itheima.d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Callable<String> call = new MyCallable(1000);

        //callable任务对象 交给futuretask(实现了runnable接口)对象
        //线程执行完毕之后通过调用其get方法得到线程执行完成的结果

        FutureTask<String> f1 = new FutureTask<>(call);
        //交给线程处理
        Thread t1 = new Thread(f1);
        //启动线程
        t1.start();

        Callable<String> call2 = new MyCallable(50);

        //callable任务对象 交给futuretask(实现了runnable接口)对象
        //线程执行完毕之后通过调用其get方法得到线程执行完成的结果

        FutureTask<String> f2 = new FutureTask<>(call2);
        //交给线程处理
        Thread t2 = new Thread(f2);
        //启动线程
        t2.start();
        /*try {
            System.out.println("第一个结果"+f1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("第二个结果"+f2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        new Thread(()->{
            try {
                System.out.println("第一个结果"+f1.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                System.out.println("第二个结果"+f2.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}

/**
 * 定义一个人物类 实现Callable接口 应该申明线程任务执行完毕后的结果数据类型
 */
class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n){
        this.n = n;
    }
    /**
     * 重写call方法（任务方法）
     */
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;

        }
        return "子线程返回的结果是："+sum;
    }
}
