package com.itheima.d1_dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 目标：学会使用dom4j解析xml文件中的数据
 * 1.导入dom4j框架
 * 2.准备一个xml文件
 *
 */
public class Dom4jHelloWorldDemo1 {
    @Test
    public void parseXMLData() throws Exception {
        //1.创建一个dom4j的解析器对象，代表整个dom4j框架
        SAXReader saxReader = new SAXReader();
        //Document document = saxReader.read(new File("D:\\javapromax\\xml-app\\src\\Contacts.xml"));
        //Document document = saxReader.read(new FileInputStream("D:\\javapromax\\xml-app\\src\\Contacts.xml"));
        //注意：/是直接去src下寻找的文件
        InputStream is =Dom4jHelloWorldDemo1.class.getResourceAsStream("/Contacts.xml");
        Document document = saxReader.read(is);

        //获取根元素对象
        Element root = document.getRootElement();
        System.out.println(root.getName());
    }

}
