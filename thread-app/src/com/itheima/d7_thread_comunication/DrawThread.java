package com.itheima.d7_thread_comunication;

public class DrawThread extends Thread{
    private Account account;
    public DrawThread(Account account,String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {

            account.drawMoney(100000);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
