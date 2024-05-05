package exercise2.IO.Release_resources;

//专业的程序，不要运行此程序
//finally代码区的特点：无论try中的程序是否正常执行，还是出现异常，最后一定会执行finally区代码，除非虚拟机终止。
import java.io.*;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Release_resources
 * @Project：study
 * @name：test2
 * @Date：5/5/2024 15:01
 * @Filename：test2
 */
public class test2 {
    public static void main(String[] args) {
        //这里将输入输出流通道至0，不建立对应通道。用于预防创建管道之前的异常问题
        InputStream is=null;
        OutputStream os=null;
        try {
            System.out.println(10/0);//这里出现了一个异常
            //1.创建一个字符的输入流
            is=new FileInputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima04.txt");

            //2.创建一个字符的输出流
            os=new FileOutputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima04.txt");

            System.out.println(10/0);

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
        }finally {
            //释放资源的操作
            //判断管道是否建立的问题。如果管道建立之前出现异常应该怎么操作，管道建立之后出现异常应该怎么操作。
            try {
                if (os != null){
                    os.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (is != null){
                    is.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
