package exercise1.API9;

import java.util.Calendar;
import java.util.Date;

public class test3 {
    public static void main(String[] args) {
        //1.得到系统此刻时间对应的日历对象
        Calendar now=Calendar.getInstance();
        //打印出日历中的全部信息
        System.out.println(now);

        //2.获取日历中的某个信息
        int year=now.get(Calendar.YEAR);
        System.out.println(year);

        //3.日历中的日期对象
        Date d=now.getTime();
        System.out.println(d);

        //4.获得学生毫秒值
        long time=now.getTimeInMillis();
        System.out.println(time);

        //5.修改日历中的信息
        //now.set(Calendar.MONTH,9);
        //System.out.println(now);

        //6.为这个信息增加或者减少多少
        //now.add(Calendar.DAY_OF_YEAR,190);
    }
}
