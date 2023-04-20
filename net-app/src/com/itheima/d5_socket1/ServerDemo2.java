package com.itheima.d5_socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标：开发Socket网络编程入门代码的服务端，实现接收消息
 *
 */

public class ServerDemo2 {
    public static void main(String[] args) {

        try {
            System.out.println("==========服务端启动成功==========");
            //注册端口
            ServerSocket serverSocket = new ServerSocket(7777);

            //必须调用accept方法 等待接收客户端的Socket连接请求，建立Socket通信管道
            Socket socket = serverSocket.accept();

            //从Socket通信管道中得到一个字节输出流
            InputStream is = socket.getInputStream();

            //把字节输入流包转成缓冲字符输入流进行消息的接收
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            //按行读接收消息
            String msg;
            if((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress()+" :"+msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
