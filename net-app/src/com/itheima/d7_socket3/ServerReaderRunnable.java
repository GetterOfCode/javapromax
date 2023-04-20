package com.itheima.d7_socket3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable{
    private Socket socket;
    public ServerReaderRunnable(Socket socket){
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

                //把这个消息进行端口转发给全部客户端Socket管道
                sendMsgToAll(socket.getPort()+" :"+msg);
            }
        } catch (Exception e) {
            //e.printStackTrace();

            System.out.println(socket.getRemoteSocketAddress()+"  下线了!");
            try {
                sendMsgToAll(socket.getPort()+"下线了");
            } catch (Exception exception) {
                exception.printStackTrace();
            }finally {
                ServerDemo2.allOnlineSockets.remove(socket);
            }

        }

    }

    /**
     *
     * @param msg 该管道客户端所发送的消息
     * @throws Exception
     */

    private void sendMsgToAll(String msg) throws Exception {
        for (Socket socket : ServerDemo2.allOnlineSockets) {
            //遍历列表中的所有管道
            if(this.socket.equals(socket)){
                continue;//如果是自己,就不发送，直接跳过
            }else {
                PrintStream ps = new PrintStream(socket.getOutputStream());//创建每个端口对应管道的打印输出流
                ps.println(msg);
                ps.flush();
            }

        }
    }
}
