package com.itheima.d7_thread_comunication;

public class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
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

    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if(this.money>=money){
                this.money -= money;
                System.out.println(name+"取钱"+money+"成功！余额："+this.money);
                this.notifyAll();
                this.wait();
            }else{
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void depositMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if(this.money == 0){
                this.money += money;
                System.out.println(name+"存钱"+money+"成功,账户余额："+this.money);
                this.notifyAll();
                this.wait();
            }else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
