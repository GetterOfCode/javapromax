package com.itheima.d5_serializable;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 对象序列化
 */
public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        Student s = new Student("陈磊","chenlei","1314520",21);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io-app2/src/obj.txt"));

        oos.writeObject(s);

        oos.close();

    }
}
