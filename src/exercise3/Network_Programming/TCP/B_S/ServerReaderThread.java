package exercise3.Network_Programming.TCP.B_S;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming.TCP.B_S
 * @Project：study
 * @name：ServerReaderThread
 * @Date：26/5/2024 13:35
 * @Filename：ServerReaderThread
 */
public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run(){
        //响应一个网页的内容
        try {
            OutputStream os = socket.getOutputStream();
            //打印流响应数据
            PrintStream ps=new PrintStream(os);

            //第一行打印
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();//换行
            ps.println("响应网页信息");
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
