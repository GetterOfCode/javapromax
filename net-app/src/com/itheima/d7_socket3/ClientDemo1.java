package com.itheima.d7_socket3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 端口转发
 */

public class ClientDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("==========客户端启动==========");
            //创建Socket通信管道请求有服务端的连接
            //public Socket(String host, int port)
            //参数一：服务端的ip地址
            //参数二：服务端的端口
            Socket socket = new Socket("127.0.0.1",6666);
            //创建一个独立的 线程专门这个客户端的读消息（服务端随时可能转发消息过来!）
            new ClientReaderThread(socket).start();


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
class ClientReaderThread extends Thread{
    private Socket socket;
    public ClientReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            //从Socket通信管道中得到一个字节输出流
            InputStream is = socket.getInputStream();

            //把字节输入流包转成缓冲字符输入流进行消息的接收
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            //按行读接收消息
            String msg;
            while((msg = br.readLine()) != null) {
                System.out.println(" 收到消息:"+msg);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("  服务端把你踢出去了!");
        }
    }
}
