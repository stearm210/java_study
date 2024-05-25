package exercise3.Network_Programming.TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
* TCP通信一般使用以下方式
* */


/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming.TCP
 * @Project：study
 * @name：Client
 * @Date：25/5/2024 14:23
 * @Filename：Client
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建对象，同时请求与服务端程序的连接
        Socket socket = new Socket("127.0.0.1", 8888);

        //2.从socket通信管道中的到一个字节输出流，用于向服务端发送数据
        OutputStream os = socket.getOutputStream();

        //3.将低级字节输出流包装成数据输出流
        DataOutputStream dos=new DataOutputStream(os);

        //4.开始将数据写出去
        dos.writeUTF("将数据写出去，连接成功");
        dos.close();

        socket.close();//释放连接资源

    }
}
