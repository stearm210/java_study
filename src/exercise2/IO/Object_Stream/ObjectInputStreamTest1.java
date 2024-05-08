package exercise2.IO.Object_Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Object_Stream
 * @Project：study
 * @name：ObjectInputStreamTest1
 * @Date：8/5/2024 21:07
 * @Filename：ObjectInputStreamTest1
 */
public class ObjectInputStreamTest1 {
    public static void main(String[] args) {
        try (
                //1.创建一个输入流管道
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\java study\\IDEApro " + "code\\study\\src\\exercise2\\IO\\Object_Stream\\itheima01.txt"));

                ){
            //读入这个文件，使用强制类型转换转换为User类型
            //之后再进行打印
            User u = (User) ois.readObject();
            System.out.println(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
