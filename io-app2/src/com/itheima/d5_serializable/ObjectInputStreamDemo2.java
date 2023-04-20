package com.itheima.d5_serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 对象反序列化
 */

public class ObjectInputStreamDemo2 {
    public static void main(String[] args)throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io-app2/src/obj.txt"));
        Student s = (Student) ois.readObject();
        System.out.println(s);

    }
}
