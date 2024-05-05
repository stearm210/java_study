package exercise2.IO.IO_steam.FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


//注意，写数据的时候一般要写刷新流或者关闭流。
//刷新流的作用是将写入到文件中的数据刷新显示到文件中。
//关闭流中是包含着刷新流的。但是，一旦将流关闭
//就不能再使用流了。
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
        //后面加上一个参数true，变为可以追加数据的管道
        try (Writer fw=new FileWriter("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima06.txt",true);){
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
