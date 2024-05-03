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

        File f2=new File("D:\\java study\\data");//文件夹大小
        System.out.println(f2.length());
        System.out.println(f2.exists());//判断是否存在

        //file可以指向一个不存在的文件路径
        File f3 = new File("D:/java study/data/b.txt");
        System.out.println(f3.length());
        System.out.println(f3.exists());//判断是否存在


        //使用相对路径对文件进行查找，一般在项目工程文件夹下进行查找
        File f4 = new File("study\\src\\itheima");
        System.out.println(f4.exists());

    }
}
