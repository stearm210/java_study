package exercise2.IO.IO_steam.FileReader;


//使用文件字符输入流一般会多用于读写txt文件方便

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.IO_steam.FileReader
 * @Project：study
 * @name：FileReaderTest1
 * @Date：5/5/2024 16:13
 * @Filename：FileReaderTest1
 */
public class FileReaderTest1 {
    public static void main(String[] args) {
        //1.创建文件字符输入流管道
        //这里用alt+回车，选择第二个选项，使用try-catch方便释放资源
        //注意，这里要将创建的管道放在try旁边的圆括号中
        try (Reader fr = new FileReader("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima05.txt");
        ){
            //2.读取文本文件中的内容
            int c;//记录每次读取的字符编号

            //当字符不为空时会全部进行读出
            while ((c=fr.read()) != -1){
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
