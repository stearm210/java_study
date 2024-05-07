package exercise2.IO.Conversion_Flow;

import java.io.*;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Conversion_Flow
 * @Project：study
 * @name：ConversionFlowTest1
 * @Date：7/5/2024 19:47
 * @Filename：ConversionFlowTest1
 */
public class ConversionFlowTest1 {
    public static void main(String[] args) {
        //1.创建一个文件字符输入流与源文件接通
        //代码编码为UTF-8    文件的编码为UTF-8
        try (
                Reader fr=new FileReader("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima03.txt");
                //2.这里将文件字符输入流包装成缓冲字符输入流,提高性能
                BufferedReader br=new BufferedReader(fr);
                ){
            String line;//记录读取的行数
            while ((line=br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
