package exercise2.IO.IO_steam.FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.IO_steam.FileWriter
 * @Project：study
 * @name：FileWriterTest1
 * @Date：5/5/2024 16:38
 * @Filename：FileWriterTest1
 */
public class FileWriterTest1 {
    public static void main(String[] args) {
        //创建一个管道
        try (Writer fw=new FileWriter("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima06.txt");){
            //写入数据
            fw.write('9');
            fw.write(97);
            fw.write("对");
            //换行
            fw.write("\r\n");

            //写入一个字符串
            fw.write("哈哈哈");
            fw.write("\r\n");
            //写入字符串的一部分
            fw.write("哈哈哈哈哈哈哈哈",0,5);
            fw.write("\r\n");
            //写入一个字符串数组
            char[] buffer={'黑','马','a','b','c'};
            fw.write(buffer);
            fw.write("\r\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
