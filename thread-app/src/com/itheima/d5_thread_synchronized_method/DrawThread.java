package com.itheima.d5_thread_synchronized_method;



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