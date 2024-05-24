package exercise3.Network_Programming.UDP.More;

//客户端研发。客户端发消息，实现一发一收


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

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

        //封装到一个死循环里面，实现消息的循环发送
        //这里使用一个扫描器，用户输入什么数据，就将数据进行发送
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请说:");

            //得到用户输入的数据，并将这个数据进行打包，放入bytes数组中
            String msg = sc.nextLine();

            //一旦发现用户输入的exit数据，就退出客户端
            if ("exit".equals(msg)){
                System.out.println("退出循环");
                socket.close();//释放资源
                break;//跳出循环
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet=new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),6666);

            //3.开始正式发送信息
            socket.send(packet);
        }


        //System.out.println("客户端数据发送完毕");
    }
}
