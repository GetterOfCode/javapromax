package com.itheima.d8_threadpool;

import java.util.concurrent.*;

public class ThreadPoolDemo2 {
    public static void main(String[] args) throws Exception {
        //1.创建线程池对象
        /**
         * public ThreadPoolExecutor(int corePoolSize,
         *                               int maximumPoolSize,
         *                               long keepAliveTime,
         *                               TimeUnit unit,
         *                               BlockingQueue<Runnable> workQueue,
         *                               RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                new ThreadPoolExecutor.AbortPolicy());
        Future<String> submit1 = pool.submit(new MyCallable(10));
        Future<String> submit2 = pool.submit(new MyCallable(100));
        Future<String> submit3 = pool.submit(new MyCallable(200));
        Future<String> submit4 = pool.submit(new MyCallable(30));
        Future<String> submit5 = pool.submit(new MyCallable(400));

        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());
        System.out.println(submit4.get());
        System.out.println(submit5.get());

    }
}
