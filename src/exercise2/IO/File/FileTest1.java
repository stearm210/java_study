package exercise2.IO.File;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        //创建对象，指代具体的文件
        //下面是文件路径的不同写法
        //File f1 = new File("D:/java study/data/ab.txt");
        //File f1 = new File("D:"+File.separator+"resource"+File.separator+"ab.txt");

        File f1 = new File("D:\\java study\\data\\ab.txt");
        System.out.println(f1.length());//文件大小


    }
}
