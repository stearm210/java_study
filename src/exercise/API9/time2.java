package exercise.API9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time2 {
    public static void main(String[] args) throws ParseException {
        //1.时间的格式化
        Date d=new Date();
        System.out.println(d);
        long time=d.getTime();
        System.out.println(time);

        //格式化代码
        //首先需要创建一个对象sdf
        //之后通过sdf调用format函数中的d得到字符串对象
        //这里的d指的是当前的时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss EEE a");
        String rs=sdf.format(d);
        System.out.println(rs);

        //字符串时间解析成日期对象
        String dateStr="2022-12-12 12:12:11";
        //1.创建简单日期格式化对象
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2=sdf2.parse(dateStr);
        System.out.println(d2);

    }
}
