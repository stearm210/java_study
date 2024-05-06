package exercise2.IO.Character_Buffer_Stream;

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
                Writer fw=new FileWriter("D:\\java study\\IDEApro code\\study\\src\\exercise2\\IO\\IO_steam\\itheima08.txt",true);
                ){
            fw.write('a');
            fw.write("9");
            fw.write("对对对");
            fw.write("\r\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
