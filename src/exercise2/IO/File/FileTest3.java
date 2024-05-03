package exercise2.IO.File;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    public static void main(String[] args) throws IOException {
        //创建文件、删除文件
        File f1 = new File("D:\\java study\\data\\a.txt");
        //使用creatNesFile进行文件的创建
        System.out.println(f1.createNewFile());
    }
}
