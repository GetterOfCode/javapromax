package com.itheima.Singleinstance;

public class Singleinstance2 {
    private Singleinstance2(){}
    private static Singleinstance2 instance;
    public static Singleinstance2 getInstance(){
        if(instance == null){
            instance = new Singleinstance2();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleinstance2 inctance1 = Singleinstance2.getInstance();
        Singleinstance2 instance2 = Singleinstance2.getInstance();
        System.out.println(inctance1 == instance2);
    }
}
