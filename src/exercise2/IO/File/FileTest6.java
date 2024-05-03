package exercise2.IO.File;

import java.io.File;
import java.io.IOException;

//文件搜索案例
public class FileTest6 {
    public static void main(String[] args) throws IOException {
        searchFile(new File("D:/"),"steam");
    }

    //文件搜索
    /*
    * 去目录下搜索某个文件
    * dir 为目录
    * filename 为文件名
    * */
    public static void searchFile(File dir,String fileName) throws IOException {
        //1.非法情况拦截
        if (dir == null || !dir.exists() || dir.isFile()){
            return;//代表无法搜索
        }
        //2.dir不是null，一定是目录对象
        //获取当前目录下的全部一级文件对象
        File[] files=dir.listFiles();

        //3.判断当前目录下是否存在一级文件对象，一级是否可以拿到一级文件对象
        if (files != null && files.length>0){//当文件夹名字不为0且长度合格时
            //4.遍历全部一级文件对象
            for (File f:files){
                //5.判断遍历对象是否是文件，还是文件夹
                if (f.isFile()){
                    //是文件，判断是否是我们想找的文件
                    if(f.getName().contains(fileName)){
                        System.out.println("找到"+f.getAbsolutePath());//输出绝对路径
                        //如果想启动就可以调这个启动文件
                        //Runtime runtime=Runtime.getRuntime();
                        //runtime.exec(f.getAbsolutePath());
                    }else {
                        //是文件夹,重复这个过程
                        searchFile(f,fileName);
                    }
                }
            }
        }
    }
}
