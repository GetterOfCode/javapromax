package com.itheima.d6_junitAnnotation;

import org.junit.Test;

import java.lang.reflect.Method;

public class AnontationDemo {
    @MyTest
    public void test1(){
        System.out.println("test1");

    }
    public void test2(){
        System.out.println("test2");

    }

    public void test3(){
        System.out.println("test3");

    }
    @Test
    public void myTest()throws Exception{
        //获取类对象
        Class c = AnontationDemo.class;
        //提取全部方法
        Method[] methods = c.getDeclaredMethods();
        //遍历方法 看有没有@MyTest注解，有就run
        for (Method method : methods) {
            method.setAccessible(true);
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(new AnontationDemo());
            }
        }
    }
}
