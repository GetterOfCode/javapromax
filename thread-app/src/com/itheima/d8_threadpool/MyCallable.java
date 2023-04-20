package com.itheima.d8_threadpool;
import java.util.concurrent.Callable;
public class MyCallable implements Callable<String>{
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
        return Thread.currentThread().getName()+"执行1-"+n+"结果是："+sum;
    }
}