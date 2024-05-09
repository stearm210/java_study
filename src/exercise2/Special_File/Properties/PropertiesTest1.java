package exercise2.Special_File.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

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

        //3.打印对应的键值数据 getProperty
        System.out.println(properties.getProperty("赵敏"));
        System.out.println(properties.getProperty("张无忌"));

        //4.遍历全部的键和值
        //先得到键，然后再通过键得到value
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value= properties.getProperty(key);
            System.out.println(key+"----"+value);
        }
    }
}
