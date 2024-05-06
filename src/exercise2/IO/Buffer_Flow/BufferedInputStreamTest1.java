package exercise2.IO.Buffer_Flow;

import java.io.*;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Buffer_Flow
 * @Project：study
 * @name：BufferedInputStreamTest1
 * @Date：6/5/2024 18:56
 * @Filename：BufferedInputStreamTest1
 */
public class BufferedInputStreamTest1 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima01.txt");
                //1.定义一个字节缓冲流包装原始的字节输入流，用于提高性能
                BufferedInputStream bis = new BufferedInputStream(is);


                OutputStream os = new FileOutputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima07.txt");
                //2.定义包装一个输出缓冲流
                BufferedOutputStream bos = new BufferedOutputStream(os);
                ) {
            byte[] buffer=new byte[1024];
            int len;
            while ((len=bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
