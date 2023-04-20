package com.itheima.d3_thread_safe;

public class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, int money) {
        this.cardId = cardId;
        this.money = money;
    }
    public void DrawMoney(double money){
        String name = Thread.currentThread().getName();
        if (this.money >= money) {
            System.out.println(name+"来取钱成功，吐出"+money);
            this.money -= money;
            System.out.println(name+"取钱后剩余："+this.money);
        }else {
            System.out.println(name+"来取钱，余额不足！");

        }

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
