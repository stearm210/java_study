package exercise2.IO.Conversion_Flow;

import java.io.*;

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

        try (
                //1.得到文件的原始字节流
                InputStream is=new FileInputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima08.txt");

                //2.原始的字节输入流转换成想要的文本信息，转换为最终的字符输入流
                //原本输入的文本字符就是GBK，这里还是需要转换一下更好。
                InputStreamReader isr = new InputStreamReader(is,"GBK");

                //3.把字符输入流包装成缓冲字符输入流
                BufferedReader br = new BufferedReader(isr);
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
