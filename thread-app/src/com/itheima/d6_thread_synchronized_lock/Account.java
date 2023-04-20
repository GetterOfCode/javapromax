package com.itheima.d6_thread_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, int money) {
        this.cardId = cardId;
        this.money = money;
    }
    /*   public static void run(){
           synchronized (Account.class) {
               System.out.println("222");
           }

       }*/
    public void DrawMoney(double money){
        lock.lock();
        try {
            String name = Thread.currentThread().getName();
            //synchronized (this) {
            if (this.money >= money) {
                System.out.println(name+"来取钱成功，吐出"+money);
                this.money -= money;
                System.out.println(name+"取钱后剩余："+this.money);
            }else {
                System.out.println(name+"来取钱，余额不足！");

            }
        } finally {
            lock.unlock();
        }

        // }

    }
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
