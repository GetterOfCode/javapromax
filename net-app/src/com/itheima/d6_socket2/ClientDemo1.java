package com.itheima.d6_socket2;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("==========客户端启动==========");
            //创建Socket通信管道请求有服务端的连接
            //public Socket(String host, int port)
            //参数一：服务端的ip地址
            //参数二：服务端的端口
            Socket socket = new Socket("127.0.0.1",7777);

            //从socket通信管道中得到一个字节输出流，负责发送数据
            OutputStream os = socket.getOutputStream();
            //将低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);
            Scanner sc = new Scanner(System.in);

            while (true) {
                //发送消息
                System.out.println("请说：");
                String msg = sc.nextLine();

                ps.println(msg);
                ps.flush();
            }

            //关闭资源
            //socket.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
