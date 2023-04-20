package com.itheima.d7_socket3;

import com.itheima.d6_socket2.ServerReaderThread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 目标：使用线程池优化实现通信
 * 端口转发
 *
 */

public class ServerDemo2 {
    //使用静态变量记住一个线程池对象
    private static ExecutorService pool = new ThreadPoolExecutor(3,5,
            6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
    //创建一个SocketList储存进来的socket
    public static List<Socket> allOnlineSockets = new ArrayList<>();
    public static void main(String[] args) {

        try {
            System.out.println("==========服务端启动成功==========");
            //注册端口
            ServerSocket serverSocket = new ServerSocket(6666);

            while (true) {
                //必须调用accept方法 等待接收客户端的Socket连接请求，建立Socket通信管道
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "他来了！");//上线追踪
                //将上线的客户端Socket添加到Socket列表中
                allOnlineSockets.add(socket);
                pool.execute(new ServerReaderRunnable(socket));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
