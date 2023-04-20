package com.itheima.d4_reflect_framemwork;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {
    public static void save(Object obj){

        try (
                PrintStream ps = new PrintStream(
                        new FileOutputStream("junit-reflect-annotation-proxy-app/src/data.txt",true));
                ){

            //提取这个对象的全部成员变量：只有反射能解决
            Class c = obj.getClass();//c.getSimpleName()获取当前类名  c.getName获取全限名：包名+类名
            ps.println("============="+c.getSimpleName()+"=============");
            //提取他的全部成员变量
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {//获取成员变量的信息
                String name = field.getName();
                //提取本成员变量再obj对象中的值（取值）
                field.setAccessible(true);

                String value = field.get(obj)+"";
                ps.println(name+"="+value);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
