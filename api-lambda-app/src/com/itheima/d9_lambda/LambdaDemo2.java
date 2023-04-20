package com.itheima.d9_lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {

        Swimming s = ()->{
            System.out.println("游泳");
        };
        s.swim();
        go(()->{
            System.out.println("老师开始游泳了");
        });
    }
    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }

}
@FunctionalInterface //函数式抽象接口
interface Swimming{
    void swim();
}