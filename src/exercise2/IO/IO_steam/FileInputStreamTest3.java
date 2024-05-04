package exercise2.IO.IO_steam;

import java.io.*;

//一次性读取完全部的数据的方法

/**
 * @Author：stearm210
 * @Package：exercise2.IO.IO_steam
 * @Project：study
 * @name：FileInputStreamTest3
 * @Date：4/5/2024 19:36
 * @Filename：FileInputStreamTest3
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) throws IOException {
        //1.一次性读取全部字节的数据进入数组,创建一个数据流
        InputStream is=new FileInputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima03.txt");

        //2.准备字节数组
        //获得文件大小，以便于作用于数组中
        File f=new File("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima03.txt");
        long size=f.length();
        byte[] buffer=new byte[(int)size];
        int len=is.read(buffer);//得到输入的字符串的长度
        System.out.println(new String(buffer));
        System.out.println(size);
        System.out.println(len);

        //3.最简单的办法
        byte[] x=is.readAllBytes();
        System.out.println(new String(x));
    }
}
