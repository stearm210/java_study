package exercise2.Special_File.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

/**
 * @Author：stearm210
 * @Package：exercise2.Special_File.Properties
 * @Project：study
 * @name：PropertiesTest1
 * @Date：9/5/2024 14:56
 * @Filename：PropertiesTest1
 */
public class PropertiesTest1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个properties集合
        Properties properties=new Properties();
        System.out.println(properties);

        //2.加载文件中的数据内容
        properties.load(new FileReader("D:\\java study\\IDEApro code\\study\\src\\users.properties"));
        System.out.println(properties);


    }
}
