package exercise2.Special_File.Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author：stearm210
 * @Package：exercise2.Special_File.Properties
 * @Project：study
 * @name：PropertiesTest2
 * @Date：9/5/2024 15:21
 * @Filename：PropertiesTest2
 */
public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        //1.创建Properties对象，用它存储一些键值对数据
        //写入一些文字
        Properties properties=new Properties();
        properties.setProperty("张无忌","minmin");
        properties.setProperty("哈哈哈","ooo");
        properties.setProperty("ppp","ll");

        //2.将properties对象中的键值对数据存入属性文件中
        //写入数据时会有两个变量
        //第一个变量是文件路径，第二个变量是文件的注释
        properties.store(new FileWriter("D:\\java study\\IDEApro code\\study\\src\\users2.properties"),"i save many users!");

    }
}
