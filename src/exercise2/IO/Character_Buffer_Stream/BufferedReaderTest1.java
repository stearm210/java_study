package exercise2.IO.Character_Buffer_Stream;

import java.io.*;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Character_Buffer_Stream
 * @Project：study
 * @name：BufferedReaderTest1
 * @Date：6/5/2024 19:19
 * @Filename：BufferedReaderTest1
 */
public class BufferedReaderTest1 {
    public static void main(String[] args) {
        try (
                Reader fr=new FileReader("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima05.txt");

                //创建一个字符缓冲输入流进行输入流的包装,这样做的目的是为了提高性能
                BufferedReader br = new BufferedReader(fr);
        ) {
            char[] buffer=new char[3];
            int len;
            while ((len=br.read(buffer)) != -1){
                //输出优化之后的字符读取效果
                System.out.println(new String(buffer,0,len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
