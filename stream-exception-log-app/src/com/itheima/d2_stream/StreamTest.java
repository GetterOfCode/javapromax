package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StreamTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张无忌","张三分","赵敏","周芷若","周伯通","张硕");
        System.out.println(names);

/*        List<String> zhangLists = new ArrayList<>();
        List<String> zhouLists = new ArrayList<>();

        for (String name : names) {
            if(name.startsWith("张")){
                zhangLists.add(name);
            }else if(name.startsWith("周")){
                zhouLists.add(name);
            }
        }
        zhangLists.forEach(System.out::println);
        System.out.println("--------------");

        zhouLists.forEach(System.out::println);


        List<String> trlName = new ArrayList<>();
        for (String name : names) {
            if(name.length()==3){
                trlName.add(name);
            }
        }
        System.out.println("-------------");
        trlName.forEach(System.out::println);
        */
        //使用stream实现
        names.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(System.out::println);



    }
}
