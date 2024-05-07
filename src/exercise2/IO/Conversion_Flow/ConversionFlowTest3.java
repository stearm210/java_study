package exercise2.IO.Conversion_Flow;

//获取字节输出流，再按照指定的字符集编码将其转换成字符输出流，以后写出去的字符就会用该字符集编码了

import java.io.*;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Conversion_Flow
 * @Project：study
 * @name：ConversionFlowTest3
 * @Date：7/5/2024 20:24
 * @Filename：ConversionFlowTest3
 */
public class ConversionFlowTest3 {
    public static void main(String[] args) {
        try (
                //1.创建一个文件字符输出流
                OutputStream os=new FileOutputStream("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima09.txt");

                //2.指定输出编码
                OutputStreamWriter osw = new OutputStreamWriter(os,"GBK");

                //3.包装为缓冲流，提高xingn
                BufferedWriter bw = new BufferedWriter(osw);
                ){
            bw.write("KKKKKKkkk");
            bw.write("将进酒121212");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
