package com.itheima.d1_dom4j;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {
    public static void save(Object obj){
        try (
                PrintStream ps = new PrintStream(
                        new FileOutputStream("xml-app/src/data.txt",true));
                ){
            Class c = obj.getClass();
            ps.println("============="+c.getSimpleName()+"===============");
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                String name = field.getName();
                field.setAccessible(true);
                String value = field.get(obj)+"";
                ps.println(name+"="+value);

            }


        }catch (Exception e){

        }

    }
}
