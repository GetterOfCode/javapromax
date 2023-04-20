package com.itheima.d6_socket2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 目标：实现多发多收
 *
 */

public class ServerDemo2 {
    public static void main(String[] args) {

        try {
            System.out.println("==========服务端启动成功==========");
            //注册端口
            ServerSocket serverSocket = new ServerSocket(7777);

            while (true) {
                //必须调用accept方法 等待接收客户端的Socket连接请求，建立Socket通信管道
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "他来了！");//上线追踪
                new ServerReaderThread(socket).start();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
