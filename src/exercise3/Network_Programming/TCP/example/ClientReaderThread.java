package exercise3.Network_Programming.TCP.example;

import exercise3.Network_Programming.TCP.More.ServerReaderThread;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Author：stearm210
 * @Package：exercise3.Network_Programming.TCP.example
 * @Project：study
 * @name：ClientReaderThread
 * @Date：25/5/2024 16:46
 * @Filename：ClientReaderThread
 */
public class ClientReaderThread extends Thread{
    private Socket socket;
    public ClientReaderThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            while (true){
                try {
                    String msg=dis.readUTF();
                    System.out.println(msg);

                } catch (IOException e) {
                    System.out.println("自己下线"+socket.getRemoteSocketAddress());
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
