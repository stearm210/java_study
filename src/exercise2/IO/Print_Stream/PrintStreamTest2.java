package exercise2.IO.Print_Stream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Author��stearm210
 * @Package��exercise2.IO.Print_Stream
 * @Project��study
 * @name��PrintStreamTest2
 * @Date��8/5/2024 20:05
 * @Filename��PrintStreamTest2
 */
public class PrintStreamTest2 {
    public static void main(String[] args) {
        System.out.println("��������");
        System.out.println("־��ǧ��");

        //����һ����ӡ����������Ķ�����ӡ��һ���ļ���ȥ
        try (
                PrintStream ps = new PrintStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\Print_Stream\\itheima02.txt");
                ){
            //��ϵͳĬ�ϵĴ�ӡ���ĳ��Լ����õ�
            System.setOut(ps);
            System.out.println("��ʿĺ��");
            System.out.println("׳�Ĳ���");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
