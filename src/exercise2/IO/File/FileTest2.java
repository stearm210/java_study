package exercise2.IO.File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest2 {
    public static void main(String[] args) {
        //创建对象
        File f1 = new File("D:\\java study\\data\\ab.txt");

        //判断文件路径是否存在
        System.out.println(f1.exists());

        //判断是否为文件
        System.out.println(f1.isFile());

        //判断当前对象是否是文件夹
        System.out.println(f1.isDirectory());

        //获取文件的名字
        System.out.println(f1.getName());

        //获取文件的大小
        System.out.println(f1.length());

        //获取最后的修改时间
        //这里使用一个simpldateformat类进行整体时间的划分，分为年、月、日
        long time=f1.lastModified();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(time));

        //获取对应的路径//创建文件时使用的路径
        System.out.println(f1.getPath());

        //获取绝对路径
        System.out.println(f1.getAbsolutePath());
    }
}
