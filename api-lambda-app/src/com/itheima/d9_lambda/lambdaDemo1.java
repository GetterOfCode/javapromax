package com.itheima.d9_lambda;


public class lambdaDemo1 {

    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑得很慢！");
            }
        };
        a.run();


    }



}
abstract class Animal{
    public abstract void run();
}

