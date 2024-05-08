package exercise2.IO.Object_Stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Object_Stream
 * @Project：study
 * @name：ObjectStreamTest1
 * @Date：8/5/2024 20:47
 * @Filename：ObjectStreamTest1
 */
public class ObjectOutputStreamTest1 {
    public static void main(String[] args) {
        //2.创建一个对象字节输出流包装原始字节输出流
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\java study\\IDEApro " + "code\\study\\src\\exercise2\\IO\\Object_Stream\\itheima01.txt"));

        ) {
            //1.创建一个java对象
            User u = new User("admin", "张三", 32, "adasdsad");

            //3.序列化对象
            oos.writeObject(u);
            System.out.println("序列化成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
