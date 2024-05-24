package exercise3.Network_Programming.UDP.More;

//客户端研发。客户端发消息，实现一发一收


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

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
        //参数三：服务端的IP地址
        //参数四：服务端程序的端口
        byte[] bytes="这是一个封装之后需要发出去的信息".getBytes();
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),6666);

        //3.开始正式发送信息
        socket.send(packet);
        System.out.println("客户端数据发送完毕");
        //释放系统资源
        socket.close();
    }
}
