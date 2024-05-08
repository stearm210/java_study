package exercise2.IO.Data_Steam;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Data_Steam
 * @Project：study
 * @name：DataSteamTest1
 * @Date：8/5/2024 20:22
 * @Filename：DataSteamTest1
 */
public class DataSteamTest1 {
    public static void main(String[] args) {
        try (
                //1.包装一个低级的数据输出流
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\Data_Steam\\itheima01.txt"));
                ){
            dos.write(97);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("哈哈哈哈哈9999！");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
