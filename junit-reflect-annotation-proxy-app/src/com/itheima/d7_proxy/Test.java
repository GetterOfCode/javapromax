package com.itheima.d7_proxy;

public class Test {
    public static void main(String[] args) {
        Start s = new Start("杨超越");
        Skill s2 = StartAgentProxy.getProxy(s);
        s2.jump();
        s2.sing("黑猫警长");
        //System.out.println();
    }
}
