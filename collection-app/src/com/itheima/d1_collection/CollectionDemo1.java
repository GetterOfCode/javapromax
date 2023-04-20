package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo1 {

    public static void main(String[] args) {
        //有序 可重复 有索引
        Collection<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("Mybatis");
        System.out.println(list);
        //Integer.parseInt("23");

        //list.for
        for(String ele:list) {
            System.out.println(ele);
        }
        list.forEach(System.out::print);




        //

    }

}
