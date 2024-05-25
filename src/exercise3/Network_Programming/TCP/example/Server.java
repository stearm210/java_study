package exercise3.Network_Programming.TCP.example;

/*实现群聊操作
* 1.实现主线程接收数据，子线程分别对客户端的数据进行操作
* 2.使用一个list集合将socket信息保存，记录socket信息，方便一个客户端向其余客户端转发信息，实现群聊*/

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming.TCP
 * @Project：study
 * @name：Server
 * @Date：25/5/2024 14:23
 * @Filename：Server
 */
public class Server {
    //使用一个list集合存储socket，实现群聊操作。
    public static List<Socket> onLineSockets=new ArrayList<>();
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
            //一旦有一个客户端上线，就将这个客户端的socket存入这个list中
            onLineSockets.add(socket);

            //于是这里将主线程中的信息交给了子线程进行处理
            //3.将这个客户端对应的socket通信管道，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
        }

    }
}
