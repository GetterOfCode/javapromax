package com.itheima.d6_socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        //super(name);
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
                System.out.println(socket.getPort()+" :"+msg+" "+Thread.currentThread().getName());
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(socket.getRemoteSocketAddress()+"  下线了!");
        }
    }
}
