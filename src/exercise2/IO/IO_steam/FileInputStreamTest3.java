package exercise2.IO.IO_steam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.IO_steam
 * @Project：study
 * @name：FileInputStreamTest3
 * @Date：4/5/2024 19:36
 * @Filename：FileInputStreamTest3
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.一次性读取全部字节的数据进入数组,创建一个数据流
        InputStream is=new FileInputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima03.txt");

        //2.准备字节数组
        //获得文件大小，以便于作用于数组中
        File f=new File("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima03.txt");
        long size=f.length();
        byte[] buffer=new byte[(int)size];

    }
}
