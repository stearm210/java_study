package exercise3.Network_Programming.TCP.More;

/*
* 服务端的开发一般使用serversocket包进行*/

/*主要流程如下
* 1.先创建对象，注册端口
* 2.调用对象的accept方法，等待连接请求
* 3.创建一个输入流
* 4.将输入流中的数据调用输出*/

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming.TCP
 * @Project：study
 * @name：Server
 * @Date：25/5/2024 14:23
 * @Filename：Server
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //启动服务端
        System.out.println("启动服务端----------");

        //1.创建对象，注册端口
        ServerSocket serverSocket=new ServerSocket(8888);

        while (true){
            //这里的线程是一个主线程，主要接收管道中的信息
            //子线程需要对主线程中的信息分别进行处理
            //2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();

            //于是这里将主线程中的信息交给了子线程进行处理
            //3.将这个客户端对应的socket通信管道，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
        }

    }
}
