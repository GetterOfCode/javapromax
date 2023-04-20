package com.itheima.d3_arr;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {
    @Test
    //反射是作用在运行时的技术
    public void aTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       // System.out.println("sss" );
        ArrayList<Integer> lists = new ArrayList<>();

        lists.add(12);
        //编译成Class文件 进入运行阶段的时候，泛型会自动擦除
        Class c = lists.getClass();
        Method add = c.getDeclaredMethod("add",Object.class);//泛型擦除 参数为object.class
        boolean rs = (boolean)add.invoke(lists, "哈哈哈");
        System.out.println(rs);
        System.out.println(lists);


        ArrayList lists1 = lists;
        lists1.add("java");
        lists1.add(false);

        System.out.println(lists);

    }
}
