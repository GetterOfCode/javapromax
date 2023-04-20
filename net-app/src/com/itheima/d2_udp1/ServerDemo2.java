package com.itheima.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("========服务器启动========");
        //创建接收端对象（注册端口号参数）
        DatagramSocket socket = new DatagramSocket(8888);
        //创建一个数据包对象接收数据
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        socket.receive(packet);
        int len = packet.getLength();
        String rs = new String(buffer,0,len,"gbk");


        System.out.println("收到了："+rs);

        //获得发送端的ip和端口
        String ip  = packet.getSocketAddress().toString();
        System.out.println("对方地址："+ip);

        int port = packet.getPort();
        System.out.println("对方端口："+port);


        //System.out.println(packet.getAddress());
        socket.close();
    }
}
