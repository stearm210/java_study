package exercise3.Network_Programming.UDP.One;


//创建一个服务端进行数据的接收服务等

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming.UDP
 * @Project：study
 * @name：Server
 * @Date：24/5/2024 18:20
 * @Filename：Server
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //先启动服务端
        System.out.println("启动服务端");

        //1.创建一个服务端对象(创建一个接数据的人)。注册一个端口
        DatagramSocket socket=new DatagramSocket(6666);

        //2.创建一个数据包对象，主要用于接收数据
        byte[] buffer=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length);

        //3.使用数据包对数据进行接收
        socket.receive(packet);

        //4.从字节数组中将接收的数据直接打印出来
        //实现获取多少就输出多少
        int len=packet.getLength();
        String rs = new String(buffer,0,len);
        System.out.println(rs);


        socket.close();//释放资源
    }
}
