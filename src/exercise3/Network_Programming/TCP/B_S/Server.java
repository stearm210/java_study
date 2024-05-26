package exercise3.Network_Programming.TCP.B_S;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming.TCP.B_S
 * @Project：study
 * @name：Server
 * @Date：26/5/2024 13:34
 * @Filename：Server
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("----------服务端启动成功--------");
        //1.创建一个serversocket对象，同时为服务端注册端口
        ServerSocket serverSocket=new ServerSocket(8080);

        while (true) {
            //2.使用serverSocket对象，调用一个accept方法，等待客户端连接
            Socket socket=serverSocket.accept();

            System.out.println("有人上线了:"+socket.getRemoteSocketAddress());

            //3.将这个客户对应的socket通信管道，交给一个独立的线程
            new ServerReaderThread(socket).start();
        }
    }
}
