package exercise2.IO.Print_Steam;


//执行打印流的方法
//内部集成了一个缓冲流

import java.io.PrintStream;
public class PrintStreamTest1 {
    public static void main(String[] args) {

        try (
                //1.创建一个打印流对象
                PrintStream ps = new PrintStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\Print_Stream\\itheima01.txt");
                ){
            ps.println(97);
            ps.println('a');
            ps.println("对对对");
            ps.println(true);
            ps.println(99.5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
