package exercise2.IO.Character_Buffer_Stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Character_Buffer_Stream
 * @Project：study
 * @name：BufferedWriterTest1
 * @Date：6/5/2024 19:30
 * @Filename：BufferedWriterTest1
 */
public class BufferedWriterTest1 {
    public static void main(String[] args) {
        try (
                //这里后面加上一个true是为了可以使得写入的字符挂在以写入文件后面
                Writer fw=new FileWriter("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima08.txt",true);

                //创建字符缓冲输出流进行性能优化
                BufferedWriter bw = new BufferedWriter(fw);
                ){
            bw.write('a');
            bw.write("9");
            bw.write("对对对");
            bw.write("\r\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
