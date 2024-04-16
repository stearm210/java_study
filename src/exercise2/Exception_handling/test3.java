package exercise2.Exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//x1和x2函数的异常可以通过throws进行抛出
//直到最后得到最新的异常，这个异常会在最外层函数得到捕获
public class test3 {
    public static void main(String[] args) {

        //下面所有函数的异常都会被抛到这个最外侧函数中执行
        try {
            x1();
        } catch (FileNotFoundException e) {
            System.out.println("您要找的文件不存在");
            e.printStackTrace();//打印对应异常信息
        } catch (ParseException e) {
            System.out.println("出现时间问题");
            e.printStackTrace();
        }
    }
    public static void x1() throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=sdf.parse("2028-11-11 10:24");
        System.out.println(d);

        x2();
    }
    public static void x2() throws FileNotFoundException {
        //假设读取文件，抛出异常
        InputStream is=new FileInputStream("D:/mew.png");
    }
}
