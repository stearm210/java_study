package exercise2.IO.IO_steam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.IO_steam
 * @Project：study
 * @name：FileInputStreamTest2
 * @Date：4/5/2024 16:44
 * @Filename：FileInputStreamTest2
 */
public class FileInputStreamTest2 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileInputStream is = new FileInputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima02.txt");

        //2.读取文件中的字节数组，每次读取多个字节
        byte[] buffer=new byte[3];
        int len=is.read(buffer);
        //字节数组装换成字符串形式
        //将读取的字节转换为字符串形式
        String rs = new String(buffer);
        System.out.println(rs);
        System.out.println("当次读取的字节数量:"+len);

        int len2=is.read(buffer);
        //这里的0是指冲第一个0下标开始，len2指的是这次需要读取的字符串个数，一定要读多少，写多少
        String rs2=new String(buffer,0,len2);
        System.out.println(rs2);
        System.out.println("当次读取的字节数量:"+len2);

        //3.使用循环改造
        byte[] buffer1=new byte[3];
        int len1;//记住每次读取了多少个字节
        while((len1=is.read(buffer1)) != -1){
            String rs1 = new String(buffer1, 0, len1);
            System.out.print(rs1);//不需要换行
        }
    }
}
