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

        //2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
        Socket socket = serverSocket.accept();

        //3.从socket通信管道中的到一个字节输入流
        InputStream is = socket.getInputStream();

        //4.把原始的字节输入流包装成数据输入流
        DataInputStream dis=new DataInputStream(is);

        //5.使用数据输入流读取客户端发送过来的数据
        String rs = dis.readUTF();
        System.out.println(rs);

        //获取客户端的IP地址
        System.out.println(socket.getRemoteSocketAddress());

        //关闭管道
        dis.close();
        socket.close();
    }
}
