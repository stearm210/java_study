package exercise3.Network_Programming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming
 * @Project：study
 * @name：InetAddressTest1
 * @Date：24/5/2024 16:26
 * @Filename：InetAddressTest1
 */
public class InetAddressTest1 {
    public static void main(String[] args) throws IOException {
        //1.获取本机ip地址对象，使用localhost对象。创建一个对象
        InetAddress ip1=InetAddress.getLocalHost();

        //输出ip具体信息
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //2.获取指定IP或者域名IP地址对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        //3.判断当前主机是否与其余IP连通。相当于是一个ping命令
        System.out.println(ip2.isReachable(6000));

    }
}
