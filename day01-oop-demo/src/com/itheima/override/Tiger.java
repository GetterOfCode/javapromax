package com.itheima.override;

public class Tiger extends Animal{
    @Override
    public void run(){
        System.out.println(super.name+"嘿嘿");
    }
}
