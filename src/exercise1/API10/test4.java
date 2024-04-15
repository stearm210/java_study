package exercise1.API10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test4 {
    public static void main(String[] args) {
        //1.创建一个日期时间格式化器对象
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        //2.对时间进行格式化
        //下面得到一个时间对象，这个时间对象是指当地时间对象
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);

        //使用String字符串对这个时间格式化对象进行接收，输出对应格式化对象
        String rs=formatter.format(now);
        System.out.println(rs);

        //3.格式化时间其他方案
        String rs2=now.format(formatter);
        System.out.println(rs2);





    }
}
