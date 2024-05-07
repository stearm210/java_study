package exercise2.IO.Conversion_Flow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

//InputStreamReader(字符输入转换流)
//这种办法是解决字符乱码问题的，先获取文件原始的字节流，之后将其按照对应的字符集编码转换为字符输入流
/**
 * @Author：stearm210
 * @Package：exercise2.IO.Conversion_Flow
 * @Project：study
 * @name：ConversionFlowTest2
 * @Date：7/5/2024 19:54
 * @Filename：ConversionFlowTest2
 */
public class ConversionFlowTest2 {
    public static void main(String[] args) {
        //1.创建一个文件字符输入流与源文件接通
        //代码编码为UTF-8    文件的编码为jbk时
        try (
                Reader fr=new FileReader("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima08.txt");
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
