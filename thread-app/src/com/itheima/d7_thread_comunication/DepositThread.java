package com.itheima.d7_thread_comunication;

public class DepositThread extends Thread{
    private Account account;
    public DepositThread(Account account,String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            account.depositMoney(100000);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
