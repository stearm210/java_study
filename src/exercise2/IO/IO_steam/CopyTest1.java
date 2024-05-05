package exercise2.IO.IO_steam;

//进行照片的复制操作

import java.io.*;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.IO_steam
 * @Project：study
 * @name：CopyTest1
 * @Date：4/5/2024 20:07
 * @Filename：CopyTest1
 */
public class CopyTest1 {
    public static void main(String[] args) throws IOException {
        //1.创建输入流管道，将图片放在输入流管道中
        InputStream is=new FileInputStream("C:\\Users\\pyzxW\\Pictures\\Camera Roll\\a.jpg");

        //2.创建字节输出流,图片的输出位置确定。并且定义图片的名字为a
        OutputStream os=new FileOutputStream("D:\\java study\\a.jpg");

        //3.创建一个字节数组，负责转移字节数据
        byte[] buffer=new byte[1024];

        //4.从字节输入流中读取字节数据，并且写到字节输出流中，读多少写多少
        int len;//记录读了多少字节
        while ((len=is.read(buffer)) != -1){
            //这里是保证读多少，写多少
            os.write(buffer,0,len);
        }
        //先关输出，再关输入流
        os.close();
        is.close();
        System.out.println("复制完成");
    }
}
