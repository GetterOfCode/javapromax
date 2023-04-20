package com.itheima.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class CilentDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=======客户端启动=======");
        //创建发送端对象
        DatagramSocket socket = new DatagramSocket();
        // public DatagramPacket(byte buf[], int length,
        //                          InetAddress address, int port)
        //参数一：封装要发送的数据
        //参数二：发送数据的大小
        //参数三：服务器主机ip地址
        //参数四：服务器端口
        byte[] buffer = "中国人民万岁！".getBytes("gbk");
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length, InetAddress.getLocalHost(),8888);
        socket.send(packet);
        socket.close();

    }
}
