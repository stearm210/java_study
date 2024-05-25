package exercise3.Network_Programming.TCP.example;

//写一个线程类，使得子线程可以对多个客户端信息进行处理

import java.io.*;
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
* 3.这里在run方法中写了子线程接收到一个客户端之后需要进行的操作
* */

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();

            //字节输入流进行升级，变为DataInputStream
            DataInputStream dis=new DataInputStream(is);
            while (true){
                try {
                    String msg=dis.readUTF();
                    System.out.println(msg);

                    //把这个消息分发给全部客户端进行接收
                    sendMsgToAll(msg);
                } catch (IOException e) {
                    System.out.println("客户端有人下线"+socket.getRemoteSocketAddress());
                    //有人下线时，就将其的信息从socket中剔除
                    Server.onLineSockets.remove(socket);

                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMsgToAll(String msg) throws IOException {
        //将消息发送给全部的socket管道进行接收
        for (Socket onLineSocket : Server.onLineSockets) {
            //得到一个数据输出流，用于发送出数据
            OutputStream os = onLineSocket.getOutputStream();
            //对输出数据进行一个包装
            DataOutputStream dos=new DataOutputStream(os);

            //推送消息
            dos.writeUTF(msg);
            dos.flush();//刷新
        }
    }
}
