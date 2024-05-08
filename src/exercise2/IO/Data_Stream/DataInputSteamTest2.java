package exercise2.IO.Data_Stream;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Data_Steam
 * @Project：study
 * @name：DataInputSteamTest2
 * @Date：8/5/2024 20:30
 * @Filename：DataInputSteamTest2
 */
public class DataInputSteamTest2 {
    public static void main(String[] args) {
        try (
                //创建一个字符输入流，支持类型+数据输入
                //包装文件
                DataInputStream dis = new DataInputStream(new FileInputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\Data_Steam\\itheima01.txt"));
                ){
            int i=dis.readInt();
            System.out.println(i);

            double d=dis.readDouble();
            System.out.println(d);

            boolean b= dis.readBoolean();
            System.out.println(b);

            String rs=dis.readUTF();
            System.out.println(rs);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
