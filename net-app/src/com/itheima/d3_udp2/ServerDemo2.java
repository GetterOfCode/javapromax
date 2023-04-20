package com.itheima.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 多发多收
 */

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("========服务器启动========");
        //创建接收端对象（注册端口号参数）
        DatagramSocket socket = new DatagramSocket(8888);
        //创建一个数据包对象接收数据
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        while (true) {
            socket.receive(packet);
            int len = packet.getLength();
            String rs = new String(buffer,0,len,"gbk");
            if("exit".equals(rs)){

                break;
            }

            System.out.println(packet.getSocketAddress()+"收到了："+rs+"  "+
                    new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
        }


        //System.out.println(packet.getAddress());
        socket.close();
    }
}
