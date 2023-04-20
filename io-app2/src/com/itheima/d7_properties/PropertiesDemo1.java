package com.itheima.d7_properties;

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.setProperty("qis","123456");
        properties.setProperty("admi","123456");
        properties.setProperty("root","123456");
        properties.setProperty("yooh","123456");
        properties.setProperty("积极","123456");


        properties.store(new FileWriter("io-app2/src/users.properties"),"哈哈哈哈");

    }
}
