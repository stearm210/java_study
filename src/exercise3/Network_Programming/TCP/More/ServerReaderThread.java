package exercise3.Network_Programming.TCP.More;

//写一个线程类，使得子线程可以对多个客户端信息进行处理

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming.TCP.More
 * @Project：study
 * @name：ServerReaderThread
 * @Date：25/5/2024 15:52
 * @Filename：ServerReaderThread
 */

/*
* 1.这里交给了一个子线程类进行操作
* 2.子线程类需要用socket参数输入有参构造
* 3.这里在run方法中写了子线程接收到一个客户端之后需要进行的操作*/
public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            while (true){
                String msg=dis.readUTF();
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
