package com.itheima.d7_properties;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("io-app2/src/users.properties"));
        System.out.println(properties);
        String s = properties.getProperty("积极");
        System.out.println(s);

    }
}
