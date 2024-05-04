package exercise2.IO.IO_steam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.IO_steam
 * @Project：study
 * @name：FileInputStreamTest1
 * @Date：4/5/2024 16:12
 * @Filename：FileInputStreamTest1
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        //1.创建文件输入流管道，与原文件接通
        //简化写法
        InputStream is = new FileInputStream(("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima01.txt"));

        //2.读取文件的字节数据
        int b1=is.read();
        System.out.println((char)b1);

        int b2=is.read();
        System.out.println((char)b2);
    }
}
