package exercise2.IO.Print_Steam;

import java.io.PrintStream;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Print_Stream
 * @Project：study
 * @name：PrintStreamTest2
 * @Date：8/5/2024 20:05
 * @Filename：PrintStreamTest2
 */
public class PrintStreamTest2 {
    public static void main(String[] args) {
        System.out.println("老骥伏枥");
        System.out.println("志在千里");

        //创建一个打印流，将上面的东西打印进一个文件中去
        try (
                PrintStream ps = new PrintStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\Print_Steam\\itheima02.txt");
                ){
            //将系统默认的打印流改成自己设置的
            System.setOut(ps);
            System.out.println("烈士暮年");
            System.out.println("壮心不已");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
