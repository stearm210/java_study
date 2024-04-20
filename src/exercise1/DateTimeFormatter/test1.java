package exercise1.DateTimeFormatter;

import java.time.LocalDate;

public class test1 {
    public static void main(String[] args) {
        //得到对象，使用.now()方法得到当前时间
        LocalDate ld=LocalDate.now();

        //下面的方法为获取当前时间对应的年月日等信息
        //1.获取对象中的信息
        int year=ld.getYear();//年
        int month=ld.getMonthValue();//月
        int day=ld.getDayOfMonth();//日
        int dayOfYear=ld.getDayOfYear();//一年中的第几天
        int dayOfWeek=ld.getDayOfWeek().getValue();//星期几

        //2.直接修改某个信息
        LocalDate ld2=ld.withYear(2999);
        System.out.println(ld);
        System.out.println(ld2);
        //3.把修改的信息加多少
        LocalDate ld3=ld.plusYears(2);
        LocalDate ld4=ld.plusMonths(2);
        //4.修改的信息减少多少
        LocalDate ld5=ld.minusYears(2);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println(ld5);
        //5.获取指定日期的LocalDate对象
        //创建这两个日期对象
        LocalDate ld6=LocalDate.of(2099,12,12);
        LocalDate ld7=LocalDate.of(2099,12,12);
        System.out.println(ld6);
        System.out.println(ld7);
        //6.判断两个日期对象是否相等、日期在前面还是后面
        System.out.println(ld6.equals(ld7));
        System.out.println(ld6.isAfter(ld));
        System.out.println(ld7.isBefore(ld));

    }
}
