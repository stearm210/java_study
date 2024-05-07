package exercise2.IO.Character_Buffer_Stream;

//这个案例是不能运行的，注意
//这个案例是一个文本文件（里面有许多文字），这些文字被分割成多段，这个代码的作用是将这些文字进行排序之后拼接到一起。形成一段文本文字输出到其余文件中

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Character_Buffer_Stream
 * @Project：study
 * @name：example
 * @Date：6/5/2024 19:50
 * @Filename：example
 */
public class example {
    public static void main(String[] args) {
        try (
                BufferedReader br=new BufferedReader(new FileReader("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima01.txt"));

                BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima02.txt"));
        ) {

            //这里使用一个list集合将文件中的文字放入list集合中，方便后面进行读取。
            List<String> data = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }

            Collections.sort(data);
            System.out.println(data);

            for (String ln:data){
                bw.write(ln);
                bw.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
