package exercise3.Network_Programming.UDP;

//客户端研发。客户端发消息，实现一发一收


import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming.UDP
 * @Project：study
 * @name：Client
 * @Date：24/5/2024 18:19
 * @Filename：Client
 */
public class Client {
    public static void main(String[] args) throws Exception{
        //1.创建一个客户端对象，也就是发送数据的人
        DatagramSocket socket=new DatagramSocket();

        //2.创建数据包对象封装要发出去的数据
        //这是一个有参构造，传入的参数有
        //参数一：封装要发出去的数据
        //参数二：发出去的数据大小(字节个数)
        byte[] bytes="这是一个封装之后需要发出去的信息".getBytes();
        DatagramPacket packet=new DatagramPacket();

    }
}
