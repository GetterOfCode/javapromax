package com.itheima.d1_inetAdress;

import java.net.InetAddress;

public class InetAdressDemo1 {

    public static void main(String[] args) throws Exception {
        //获取本机地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        //获取公网ip对象
        InetAddress ip3 = InetAddress.getByName("36.152.44.96");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        //判断是否能互通
        System.out.println(ip3.isReachable(5000));

    }
}
