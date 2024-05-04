package exercise2.IO.IO_steam.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//创建一个写出的流，说白了就是创建一个新的文件，之后将代码中的字符输入到文件中。

//但是输入流就是将一堆字符输入到文件中，这个是与输出流不一样的
/**
 * @Author：stearm210
 * @Package：exercise2.IO.IO_steam.FileOutputStream
 * @Project：study
 * @name：FileOutputStreamTest1
 * @Date：4/5/2024 19:47
 * @Filename：FileOutputStreamTest1
 */
public class FileOutputStreamTest1 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输出流管道
        FileOutputStream os = new FileOutputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima04.txt");

        //2.开始写对应的字节出去
        os.write(97);
        os.write('b');
        os.close();
    }
}
