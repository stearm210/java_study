package exercise2.IO.Release_resources;

//新的资源释放方法

import java.io.*;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Release_resources
 * @Project：study
 * @name：test3
 * @Date：5/5/2024 15:34
 * @Filename：test3
 */
public class test3 {
    public static void main(String[] args) {
        try (//1.创建一个字符的输入流
             InputStream is=new FileInputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima04.txt");

             //2.创建一个字符的输出流
             OutputStream os=new FileOutputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima04.txt");){
            //3.创建一个字节数组
            byte[] buffer=new byte[1024];
            //4.从字节输入流中读取字节，写到字节输出流中，读多少写多少
            int len;//记录每次读取了多少字节
            while ((len=is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
