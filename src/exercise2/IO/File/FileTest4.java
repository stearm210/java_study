package exercise2.IO.File;

import java.io.File;

//遍历文件夹问题
public class FileTest4 {
    public static void main(String[] args) {
        //获取当前文件夹下所有的一级文件夹名，并到一个字符串数组中返回
        //字符串数组、文件名数组
        File f1 = new File("D:\\go xuexi");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }

        //对象数组
        //获取当前目录下所有的一级文件对象到一个文件对象数组中返回
        File[] files = f1.listFiles();
        for (File file:files){
            System.out.println(file.getPath());
        }

    }
}
