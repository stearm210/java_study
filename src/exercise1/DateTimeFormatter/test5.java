package exercise1.DateTimeFormatter;

import java.time.LocalDate;
import java.time.Period;

public class test5 {
    public static void main(String[] args) {
        //不管怎么样，一定要创建一个日期对象
        //1.创建日期对象
        LocalDate start=LocalDate.of(2029,8,10);
        LocalDate end=LocalDate.of(2029,8,30);

        //2.创建period对象，封装两个日期对象
        Period period=Period.between(start,end);

        //3.通过period对象获取两个日期对象相差的信息
        //间隔多少年
        System.out.println(period.getYears());

        //间隔多少月
        System.out.println(period.getMonths());

        //间隔多少天
        System.out.println(period.getDays());
    }
}
