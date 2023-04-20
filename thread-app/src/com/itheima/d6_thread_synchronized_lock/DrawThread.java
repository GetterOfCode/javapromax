package com.itheima.d6_thread_synchronized_lock;




public class DrawThread extends Thread{
    private Account account;

    public DrawThread(Account account, String name){
        super(name);
        this.account = account;

    }
    @Override
    public void run() {
        account.DrawMoney(100000);
    }
}