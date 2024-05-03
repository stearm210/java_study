package exercise2.IO.File;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    public static void main(String[] args) throws IOException {
        //创建文件、删除文件
        File f1 = new File("D:\\java study\\data\\a.txt");
        //使用creatNesFile进行文件的创建
        System.out.println(f1.createNewFile());

        //创建文件夹(创建一级文件夹)
        File f2 = new File("D:\\java study\\data\\aaa");
        System.out.println(f2.mkdir());

        //创建多级文件夹
        File f3 = new File("D:\\java study\\data\\aaa\\bbb\\ccc");
        System.out.println(f3.mkdirs());

        //删除文件，只能删除空文件，不能删除非空文件
        System.out.println(f1.delete());
        System.out.println(f2.delete());
    }
}
